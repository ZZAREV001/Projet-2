package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.TreeMap;

public class WriteFile implements IWriteFile {
    private String file;


    @Override
    public void symptomFileWriter(TreeMap<String, Integer> symptoms) throws FileNotFoundException {
        String resultFileName = "results.txt";
        System.out.println("\nLoading symptoms into: " + resultFileName);
        var writer = new PrintWriter(resultFileName);

        for (TreeMap.Entry s : lastEntries.entrySet()) {
            System.out.println(s.getKey() + " : " + s.getValue());
            writer.println(s.getKey() + " : " + s.getValue());
        }
        writer.close();

    }
}
