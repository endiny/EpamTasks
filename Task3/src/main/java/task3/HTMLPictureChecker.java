package task3;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created on 17.03.16.
 * @author Vladislav Boboshko
 */
public class HTMLPictureChecker {
    private Pattern wordPattern;
    private Matcher matcher;
    private String buffer;

    public boolean setFile(String name) {
        try {
            buffer = new String(
                    Files.readAllBytes(Paths.get("src/main/resources/Java.SE.03.Information handling_task_attachment.html")),
                    Charset.forName("windows-1251"));
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private List<String> getSentences() {
        BreakIterator breakIterator = BreakIterator.getSentenceInstance(new Locale("ru", "RU"));
        String text = buffer.replaceAll("\\<.*?>","").replaceAll("\n", "");
        breakIterator.setText(text);
        List<String> sentences = new ArrayList<>();
        int start = breakIterator.first();
        int end = breakIterator.next();
        for (; end != BreakIterator.DONE; start = end, end = breakIterator.next()) {
            sentences.add(text.substring(start, end));
        }
        return sentences;
    }

    public boolean check() {
        boolean result = true;
//        List<String> sentences = getSentences();
        String text = buffer.replaceAll("\\<.*?>","").replaceAll("\n", "");
        Matcher first = Pattern.compile("(Р|р)исун(ок|ка|ку|ком|ке)\\s[0-9]+")
                .matcher(text);
        while (first.find()) {
            System.out.println(first.group());
            System.out.println(first.group(1));
        }
        return true;
    }

    public HTMLPictureChecker() {
        wordPattern = Pattern.compile("(\\p{L})(.+|.?)(Р|р)исун(ок|ка|ку|ком|ке)\\s[0-9]+(.+|\\.|\\?|!)");
    }
}
