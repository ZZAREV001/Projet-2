package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.util.TreeMap;

public interface IWriteFile {
    void symptomFileWriter(TreeMap<String, Integer> symptoms) throws FileNotFoundException;  // Ecrire dans un fichier résultat.txt. Quel est le résultat attendu?
}
