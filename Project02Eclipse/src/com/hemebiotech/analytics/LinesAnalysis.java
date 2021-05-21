package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.util.ArrayList;

public class LinesAnalysis implements LinesChecker {
    private static String line;
    private static BufferedReader reader;
    private static ArrayList<String> lineResult;

    public LinesAnalysis() {
        this.line = line;
        this.reader = reader;
        this.lineResult = lineResult;
    }

    public static void linesChecker() {
        try {
            while (line != null)
                lineResult.add(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getLine() {
        return line;
    }

    public BufferedReader getReader() {
        return reader;
    }

    public ArrayList<String> getLineResult() {
        return lineResult;
    }
}
