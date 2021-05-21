package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile implements ReadFiles {
    public ReadFile() {
    }

    public static void readLinesSymptoms() {
        try {
            List<String> allLines =
                    Files.readAllLines(Paths.get("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt"));
            for (String line : allLines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
