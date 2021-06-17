package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * Transform hashtable in a result file when used by user.
 */

public interface IWriteFile {
    void symptomFileWriter(TreeMap<String, Integer> symptoms) throws IOException;
}
