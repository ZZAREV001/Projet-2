package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * SymptomCounter is the class that reorder the symptoms from txt file and count the number of times they appear.
 */
public class SymptomCounter implements ISymptomCounter  {
    private List<String> symptomList;
    private Integer occurrences;
    private String input;

    /**
     * countSymptoms() returns a TreeMap that includes each symptom and the number of times it appears.
     * Integer occurrences: count the number of times a symptom appears in the list of String.
     * @param symptomList
     * @return result
     */
    @Override
    public TreeMap<String, Integer> countSymptoms(List<String> symptomList) {
        TreeMap<String, Integer> result = new TreeMap<String, Integer>();

        for (String symptom : symptomList) {
            Integer currentCount = result.get(symptom);
            if (currentCount != null) {
                currentCount++;
                result.put(symptom, currentCount);
            } else {
                result.put(symptom, 1); // First occurrence (1).
            }
        }
        return result;
    }

    public List<String> getSymptomList() {
        return symptomList;
    }

    public Integer getOccurrences() {
        return occurrences;
    }

}
