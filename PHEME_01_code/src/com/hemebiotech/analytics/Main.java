package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * Main class launches the program.
 */
public class Main {

    /**
     * main method executes the different steps of the program by calling methods from the 3 classes.
     * @param args Java command line arguments (type array of Strings)
     * @throws IOException throw exception in case of problem with files
     */
    public static void main(String[] args) throws IOException {

        /**
         * Read the path where the file is located. Path may be changed anywhere in the storage disk.
         */
        ReadFile symptoms1 = new ReadFile();
        String path = "/Users/GoldenEagle/IdeaProjects/Projet-2-bis/PHEME_01_code/symptoms.txt";
        System.out.println(symptoms1.getSymptoms(path));

        /**
         * Transform the file in a hash table data structure where we count each symptoms.
         */
        SymptomCounter analyze1 = new SymptomCounter();
        TreeMap<String, Integer> analyze2 = analyze1.countSymptoms(symptoms1.getSymptoms(path));
        System.out.println(analyze2);

        /**
         * Transfer the previous hash table to a result.out file.
         */
        WriteFile writer0 = new WriteFile();
        writer0.symptomFileWriter(analyze2);
    }

}


