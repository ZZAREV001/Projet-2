package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) throws IOException {
        var symptoms2 = new ReadFile();
        String path = "/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt";
        System.out.println(symptoms2.getSymptoms(path));



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



