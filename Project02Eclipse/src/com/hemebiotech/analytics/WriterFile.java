package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class WriterFile {
    private String filename;
    private String directory;
    private Path path = Paths.get(directory, filename);
    private String content;

    public WriterFile() {
        this.filename = filename;
        this.directory = directory;
        this.content = content;
    }

    public void writeFiles() {
        try {
            Files.write(path, content.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
        }
    }

}
