package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;

/**
 * WriteFile is a class for reading the TreeMap data structure from SymptomCounter class
 * and generating a result.out file where the user can see all symptoms with their occurrences.
 */
public class WriteFile implements IWriteFile {
    private String fileName;

    /**
     * symptomFileWriter() generates the result.out file after reading the symptoms and their occurrences.
     * @param symptoms
     * @return void
     */
    @Override
    public void symptomFileWriter(TreeMap<String, Integer> symptoms) throws IOException {
            var writer1 = new PrintWriter(new FileWriter("result.out"));
            writer1.write(String.valueOf(symptoms));
            writer1.close();
    }

    public String getFileName() {
        return fileName;
    }
}
