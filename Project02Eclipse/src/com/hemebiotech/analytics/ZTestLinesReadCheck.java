package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZTestLinesReadCheck {
    private HashMap<Object, ArrayList<String>> map;
    private String symptoms;
    private String path;

    public ZTestLinesReadCheck() {
        map = new HashMap<Object, ArrayList<String>>();
        var path = Paths.get("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt", "symptoms.txt");
    }

    // Add a symptom in parameter into symptoms.txt.
    public boolean addSymptom(String symptomsC) {
        if (map.containsKey(symptomsC))
            return false;
        map.put(symptomsC, new ArrayList<String>());
        return true;
    }

    // Delete a symptom into symptoms.txt
    public void removeSymptom(String symptomsC) {
        map.remove(symptomsC);
    }

    // Display symptoms
    public void displaySymptoms() {
        System.out.println(symptoms);

        for (Object s : map.keySet()) {
            System.out.println(s);
            System.out.println(map.get(s));
        }
    }

    // Create a function that read a .txt file and returns tree maps as Tree.
    public Map<Integer, Long> wordCountByLength() {
        try (Stream<String> lines = Files.lines(Paths.get(String.valueOf(path)))) {
            return lines.map(l -> l.split(" ")).flatMap(Arrays::stream).filter(s -> !s.isEmpty())
                    .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Count the symptoms in symptoms.txt


    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

}