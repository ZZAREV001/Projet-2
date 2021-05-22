package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class WriterFile implements WriterMethod {
    private File file;

    public WriterFile() {
        this.file = file;
    }

    public static void fileWriter(Scanner scan) throws IOException {
        String fileContent = "";
        while (scan.hasNextLine())
            fileContent = fileContent.concat(scan.nextLine() + "\n");

        var writer = new FileWriter("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/new-Symptoms.txt");
        writer.write(fileContent);
        writer.close();
    }

    @Override
    public void WriterFile() {

    }
}
