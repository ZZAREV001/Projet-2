package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriterFile implements WriterMethod {
    private String writtenSymptoms;

    public WriterFile(String writtenSymptoms) {
        this.writtenSymptoms = writtenSymptoms;
    }

    /**
     * write new symptoms in a new file results.txt
     */
    public void writeSymptoms() throws IOException {
        try {
            var p = Paths.get("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt");
            var contentInList = new ArrayList<String>();

            while (writtenSymptoms != null)
                contentInList.add(writtenSymptoms);

            var p1 = Files.write(p, contentInList);
            var p2 = Files.createFile(p1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getWrittenSymptoms() {
        return writtenSymptoms;
    }
}
