package com.hemebiotech.analytics;

import java.io.IOException;

import static com.hemebiotech.analytics.LinesReadCheck.countFunction;
import static com.hemebiotech.analytics.ReadFile.getSymptoms;
import static com.hemebiotech.analytics.WriterMethod.writeSymptoms;

public class Main {

    public static <path> void main(String[] args) throws IOException {
        getSymptoms();
        writeSymptoms();
        countFunction();
    }


}



