package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile symptoms1 = new ReadFile();
        String path = "/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt";
        System.out.println(symptoms1.getSymptoms(path));

        SymptomCounter analyze1 = new SymptomCounter();
        TreeMap<String, Integer> analyze2 = analyze1.countSymptoms(symptoms1.getSymptoms(path));
        System.out.println(analyze2);

        WriteFile writer0 = new WriteFile();
        writer0.symptomFileWriter(analyze2);
    }

}


