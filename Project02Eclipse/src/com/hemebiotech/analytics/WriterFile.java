package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriterFile implements WriterMethod {
    private String writtenSymptoms;
    private String path1;

    public WriterFile(String writtenSymptoms) {
        this.writtenSymptoms = writtenSymptoms;
    }

    /**
     * write new symptoms in a new file results.txt
     */


    public String getWrittenSymptoms() {
        return writtenSymptoms;
    }
}
