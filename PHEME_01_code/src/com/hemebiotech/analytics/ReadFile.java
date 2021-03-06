package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * ReadFile is a class for reading symptoms in the file symptoms.txt.
 */
public class ReadFile implements IReadFile{

    /**
     * getSymptoms() returns a list of strings containing all lines of the .txt file.
     * We use java.nio, a recent package to analyze files (Java 8).
     * Average / worst case time complexity: O(1). Why? Array access.
     * @param path1 path of the file (String type)
     * @return data
     */
    @Override
    public List<String> getSymptoms(String path1) {
        List<String> data = null;
        try {
            Path p = Paths.get(path1);

            data = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}
