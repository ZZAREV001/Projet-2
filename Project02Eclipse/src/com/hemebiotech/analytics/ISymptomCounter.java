package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Search in the file and insert in hashtable all symptoms and how many times they appear.
 */

public interface ISymptomCounter {
    /**
     * Abstract data type count occurrences for each symptoms.
     * @param symptomList List of symptoms
     * @return TreeMap
     */
    public TreeMap<String, Integer> countSymptoms(List<String> symptomList);
}
