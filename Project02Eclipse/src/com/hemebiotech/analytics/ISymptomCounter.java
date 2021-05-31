package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface ISymptomCounter {
    TreeMap<Object, Object> countSymptoms(List<String> symptomList);  // Integer: compter le nombre d'occurrences
}
