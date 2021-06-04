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
