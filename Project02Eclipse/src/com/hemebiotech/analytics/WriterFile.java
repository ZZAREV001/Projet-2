package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    private static FileWriter write1;

    public WriterFile() throws IOException {
        this.write1 = new FileWriter("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt");
    }

    public static void writeFiles() {
        try {

        }

    }
}
