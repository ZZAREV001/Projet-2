package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

public interface IWriteFile {
    void symptomFileWriter(TreeMap<String, Integer> symptoms) throws IOException;
}
