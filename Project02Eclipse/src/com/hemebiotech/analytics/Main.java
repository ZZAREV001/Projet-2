package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Read the path where the file is located.
         */
        ReadFile symptoms1 = new ReadFile();
        String path = "/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt";
        System.out.println(symptoms1.getSymptoms(path));

        /**
         * Transform the file in a hashtable data structure where we count each symptoms.
         */
        SymptomCounter analyze1 = new SymptomCounter();
        TreeMap<String, Integer> analyze2 = analyze1.countSymptoms(symptoms1.getSymptoms(path));
        System.out.println(analyze2);

        /**
         * Transfer the previous hashtable to a result.out file.
         */
        WriteFile writer0 = new WriteFile();
        writer0.symptomFileWriter(analyze2);
    }

}


