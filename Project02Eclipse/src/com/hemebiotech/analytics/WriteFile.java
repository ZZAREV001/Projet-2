package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;

/**
 * WriteFile is a class for reading the TreeMap data structure from SymptomCounter class
 * and generating a result.out file where the user can see all symptoms with their occurrences.
 */
public class WriteFile implements IWriteFile {

    /**
     * symptomFileWriter() generates the result.out file after reading the symptoms and their occurrences.
     * Average / worst case time complexity: O(n). Why? Insert from hashtable to a new file.
     * Worst case space complexity: O(n). Why? Operations with arrays and hashtable are linear time if files grow.
     * @param symptoms List of symptoms
     */
    @Override
    public void symptomFileWriter(TreeMap<String, Integer> symptoms) throws IOException {
            PrintWriter writer1 = new PrintWriter(new FileWriter("result.out"));
            writer1.write(String.valueOf(symptoms));
            writer1.close();
    }

}
