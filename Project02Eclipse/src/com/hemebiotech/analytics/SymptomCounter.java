package com.hemebiotech.analytics;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * SymptomCounter is the class that reorder the symptoms from txt file and count the number of times they appear.
 */
public class SymptomCounter implements ISymptomCounter  {
    private List<String> symptomList;
    private Integer occurrences;

    /**
     * countSymptoms() returns a TreeMap that includes each symptom and the number of times it appears.
     * Integer occurrences: count the number of times a symptom appears in the list of String.
     * Linear Search algorithm. Time complexity: O(1) best case, O(n) worst case.
     * @param symptomList
     * @return result
     */
    // Linear search algorithm
    @Override
    public TreeMap<String, Integer> countSymptoms(List<String> symptomList) {
        Arrays.sort(new List[]{symptomList});
        var result = new TreeMap<String, Integer>();
        Integer count = 0;
        String first = symptomList.get(0);

        for (String s : symptomList) {
            if (first.hashCode() == s.hashCode())
                count++;
            else {
                result.put(first, count);
                count = 1;
            }
            first = s;
            result.put(first, count);
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
