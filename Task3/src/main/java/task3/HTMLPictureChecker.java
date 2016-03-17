package task3;

import java.io.*;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created on 17.03.16.
 * @author Vladislav Boboshko
 */
public class HTMLPictureChecker {
    private Pattern wordPattern;
    private Matcher matcher;
    private StringBuffer buffer;

    public boolean setFile(String name) {
        try (BufferedReader br = new BufferedReader(new FileReader(name))) {
            String tmp;
            while ((tmp = br.readLine()) != null) {
                buffer.append(tmp);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found!");
            return false;
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean check() {
        BreakIterator breakIterator = BreakIterator.getSentenceInstance(new Locale("ru", "RU"));
        String text = buffer.toString();
        breakIterator.setText(text);
        List<String> sentences = new ArrayList<>();
        int start = breakIterator.first();
        int end = breakIterator.next();
        for (; end != breakIterator.DONE; start = end, end = breakIterator.next()) {
            sentences.add(text.substring(start, end));
        }
        return true;
    }

    public HTMLPictureChecker() {
        wordPattern = Pattern.compile("(Р|р)исун(ок|ка|ку|ком|ке)\\s[0-9]+");
    }
}
