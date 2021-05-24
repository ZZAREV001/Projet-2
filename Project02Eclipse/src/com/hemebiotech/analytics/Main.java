package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static com.hemebiotech.analytics.ReadFile.getSymptoms;
import static com.hemebiotech.analytics.WriterMethod.writeSymptoms;

public class Main {

    public static void main(String[] args) throws IOException {
        getSymptoms();
        writeSymptoms();

        List<String> symptomsList = Files.lines(Paths.get("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt"))
                .filter(line -> line.contains("rash"))
                .collect(Collectors.toList());
        System.out.println(symptomsList);
    }

}



