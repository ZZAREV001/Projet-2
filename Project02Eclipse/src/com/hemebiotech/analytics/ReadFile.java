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

    public static List<String> getSymptoms() throws FileNotFoundException {
        try {
            var p = Paths.get("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt");

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
}


