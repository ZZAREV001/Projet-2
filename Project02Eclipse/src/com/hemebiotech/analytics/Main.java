package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static com.hemebiotech.analytics.ReadFile.getSymptoms;

public class Main {

    public static <path> void main(String[] args) throws IOException {
        getSymptoms("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt");
        countFunction("anxiety");

        // Add most frequent symptoms name in ArrayList.
        var listOfSymptoms = new ArrayList<String>();
        listOfSymptoms.add("rash");
        listOfSymptoms.add("anxiety");
        listOfSymptoms.add("cough");
        listOfSymptoms.add("inflammation");

        writeSymptoms("results.txt", listOfSymptoms);
    }

    public static void countFunction(String symptoms) throws IOException {
        List<String> symptomsList = Files.lines(Paths.get("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt"))
                .filter(line -> line.contains(symptoms))
                .collect(Collectors.toList());
        System.out.println(symptomsList);
    }

    public static void writeSymptoms(String path1, ArrayList<String> symptoms1) throws IOException {
        try {
            var fileWrite1 = new FileWriter(path1);
            var filePrint1 = new PrintWriter(fileWrite1);
            for (String s : symptoms1)
                filePrint1.println(s);

            filePrint1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}



