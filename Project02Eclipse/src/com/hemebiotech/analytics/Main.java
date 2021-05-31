package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static <path> void main(String[] args) throws IOException {
        // 1st Part: read symptoms from a file defined by the user. Space complexity in worst case: O(1).
        IReadFile.readFile("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt");

        // 2nd part: pick a symptom in the list and return a list indicating how many times is present the picked symptoms.
        // countFunction("fever");

        // 3rd part: add most frequent symptoms name in results.txt. For example, we add 4 symptoms.
        var listOfSymptoms = new ArrayList<String>();
        listOfSymptoms.add("rash");
        listOfSymptoms.add("anxiety");
        listOfSymptoms.add("cough");
        listOfSymptoms.add("inflammation");

        // symptomFileWriter();

        // Code style declarative and functional: call functions read, write, sort between them.
        var indicatePath = "";
        indicatePath = "/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt";
        // IReadFile.getSymptoms(indicatePath).countFunction();

    }



    public static void countFunction(String symptoms, String path) throws IOException {
        List<String> symptomsList = Files.lines(Paths.get(path))
                .filter(line -> line.contains(symptoms))
                .collect(Collectors.toList());
        System.out.println(symptomsList);
    }

    public static void writeSymptoms(String path1, ArrayList<String> symptoms1) throws IOException {
        try {
            var fileWrite1 = new FileWriter(path1);   // true: append the written file.
            var filePrint1 = new PrintWriter(fileWrite1);
            for (String s : symptoms1)
                filePrint1.println(s);

            filePrint1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}



