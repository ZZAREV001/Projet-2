package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * SymptomCounter is the class that reorder the symptoms from txt file and count the number of times they appear.
 */
public class SymptomCounter implements ISymptomCounter  {

    /**
     * countSymptoms() returns a TreeMap that includes each symptom and the number of times it appears.
     * Integer occurrences: count the number of times a symptom appears in the list of String.
     * Average case time complexity: θ(n+1) = θ(n). Why? Search in array and insert in hashtable.
     * Worst case time complexity: O(n+n) = O(2n) = O(n). Why? Search in array and insert in hashtable.
     * @param symptomList
     * @return result
     */
    @Override
    public TreeMap<String, Integer> countSymptoms(List<String> symptomList) {
        TreeMap<String, Integer> result = new TreeMap<String, Integer>();

        for (String symptom : symptomList) {             // Traverse array symptomList.
            Integer currentCount = result.get(symptom);  // Insert occurrences of a string in a local integer variable.
            if (currentCount != null) {                  // If occurrences is null:
                currentCount++;                          //      increment local variable
                result.put(symptom, currentCount);       //      Insert in hashtable occurrence and its symptom.
            } else {
                result.put(symptom, 1);                 // Else insert symptom and one occurrence in array.
            }
        }
        return result;                                  // Return sorted hashtable result.
    }
}
