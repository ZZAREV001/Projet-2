package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface IWriteFile {
    void symptomFileWriter(TreeMap<String, Integer> symptoms);  // Ecrire dans un fichier résultat.txt. Quel est le résultat attendu?
}
