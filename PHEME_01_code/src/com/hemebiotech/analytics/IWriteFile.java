package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * Transform hash table in a result file when used by user.
 */

public interface IWriteFile {
    /**
     * Abstract data type: write in file.
     * @param symptoms hash table
     * @throws IOException throw exception in case of problem with new file
     */
    void symptomFileWriter(TreeMap<String, Integer> symptoms) throws IOException;
}
