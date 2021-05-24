package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class LinesReadCheck implements LinesReadingChecking {
    private Path file;

    public LinesReadCheck() {
    }

    public List<String> linesCheckFiles() throws IOException {

        List<String> symptomsList = Files.lines(Paths.get("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt"))
                .filter(line -> line.contains(""))
                .collect(Collectors.toList());
        return symptomsList;
    }

}