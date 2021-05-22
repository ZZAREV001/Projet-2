package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;

import static com.hemebiotech.analytics.ReadFile.fileReader;
import static com.hemebiotech.analytics.WriterFile.fileWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = fileReader();
        fileWriter(scan);

    }
}
