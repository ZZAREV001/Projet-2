package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadFile implements ReadFiles {
    private String filename;

    public ReadFile() {
    }

    public static Scanner fileReader() throws FileNotFoundException {
        var file = new File("/Users/GoldenEagle/IdeaProjects/Projet-2-bis/Project02Eclipse/symptoms.txt");
        var scan = new Scanner(file);

        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
        return scan;
    }


}
