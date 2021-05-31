package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ZTestWriterFile {
    private String writtenSymptoms;
    private String path1;

    public ZTestWriterFile(String writtenSymptoms) {
        this.writtenSymptoms = writtenSymptoms;
    }

    /**
     * Write new symptoms in a new file results.txt: filter and collect symptoms from the indicated file.
     * Print each symptoms in a list of string: we will see how many times appears a symptom written by the user.
     */
    public static void countFunction(String symptoms, String path1) throws IOException {
        List<String> symptomsList = Files.lines(Paths.get(path1))
                .filter(line -> line.contains(symptoms))
                .collect(Collectors.toList());
        System.out.println(symptomsList);
    }

    public String getWrittenSymptoms() {
        return writtenSymptoms;
    }
}
