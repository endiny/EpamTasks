package com.epam.jc.task1;

import com.sun.istack.internal.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by endiny on 16.03.16.
 */
public class CrazyLogger {
    private static StringBuffer logs = new StringBuffer();
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public static void addMessage(String message) {
        logs.append('\0')
                .append(LocalDateTime.now().format(dateTimeFormatter))
                .append(" | ")
                .append(message)
                .append('\0');
    }

    public static String getAllMessages() {
        return logs.toString();
    }

    @NotNull
    public static List<String> findMessages(String pattern) {
        List<String> result = new ArrayList<String>();
        int tmpIndex = 0;
        while (tmpIndex != -1) {
            tmpIndex = logs.indexOf(pattern, tmpIndex);
            if (tmpIndex >= 0) {
                int end = logs.indexOf("\0", tmpIndex);
                String tmp = logs.substring(0, tmpIndex);
                int start = tmp.lastIndexOf('\0');
                result.add(logs.substring(++start, end));
                tmpIndex++;
            }
        }
        return result;
    }

    @NotNull
    public static String findLastMessage(String pattern) {
        int tmpIndex = logs.lastIndexOf(pattern);
        if (tmpIndex == -1) {
            return "";
        }
        int start = logs.substring(0, tmpIndex).lastIndexOf('\0');
        int end = logs.indexOf("\0", tmpIndex);
        return logs.substring(++start, end);
    }
}
