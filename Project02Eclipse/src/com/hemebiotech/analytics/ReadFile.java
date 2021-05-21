package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile implements ReadFiles {
    private String filename;
    private String directory;
    private Path path1 = Paths.get(directory, filename);

    public ReadFile() throws IOException {
        this.filename = filename;
        this.directory = directory;
    }

    public void readLines() {
        try {
            List<String> list = Files.readAllLines(path1);
            list.forEach(System.out::println);
        } catch (IOException e) {
        }
    }
}
