package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile implements IReadFile{
    /**
     * A class for reading symptoms in the file symptoms.txt.
     * Corriger le nom de la classe
     */

    /**
     * getSymptoms() returns a list of strings containing all lines of the .txt file.
     * We use java.nio, a recent package to analyze files (Java 8).
     * Linear Search algorithm. Time complexity: O(1) best case, O(n) worst case.
     * @param path1
     * @return data
     */
    @Override
    public List<String> getSymptoms(String path1) {
        List<String> data = null;
        try {
            var p = Paths.get(path1);

            data = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}
