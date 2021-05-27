package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile implements ISymptomReader {
    /**
     * read symptoms in the file symptoms.txt.
     */
    private String path1;

    public static List<String> getSymptoms(String path1) throws FileNotFoundException {
        try {
            var p = Paths.get(path1);

            List<String> data = Files.readAllLines(p);

            for (String s : data)
                System.out.println(s);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        return null;
        }

    @Override
    public List<String> GetSymptoms() {
        return null;
    }

    public String getPath1() {
        return path1;
    }

    public void setPath1(String path1) {
        this.path1 = path1;
    }
}


