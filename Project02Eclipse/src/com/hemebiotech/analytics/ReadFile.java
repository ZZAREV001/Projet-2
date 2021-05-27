package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile implements ISymptomReader {
    /**
     * A class for reading symptoms in the file symptoms.txt.
     */
    private String path1;


    /**
     * Get a path and read all lines from it by Java NIO.
     * Traverse and print each lines.
     */
    public static List<String> getSymptoms(String path1) throws FileNotFoundException {
        try {
            var p = Paths.get(path1);

            List<String> data = Files.readAllLines(p);

            for (String s : data)
                System.out.println(s);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        return null;
        }

        /**
         * open a file with FileReader class.
         * BufferedReader class allows to read the file line by line.
         * String line captures each line from the file.
         * while loop: the line from the file goes to the ArrayList data structure.
         * close() closes the file.
        */
        public static void readFile(String fileName, ArrayList<String> dataSymptoms) {
               try {
                   var fileRead1 = new FileReader(fileName);
                   var bufferRead1 = new BufferedReader(fileRead1);
                   String line;
                   while ((line = bufferRead1.readLine()) != null)
                       dataSymptoms.add(line);
                   bufferRead1.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }

    @Override
    public List<String> GetSymptoms() {
        return null;
    }

    public String getPath1() {
        return path1;
    }

    public void setPath1(String path1) {
        this.path1 = path1;
    }
}


