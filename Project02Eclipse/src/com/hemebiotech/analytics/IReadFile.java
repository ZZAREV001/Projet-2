package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source file.
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications.
 */

public interface IReadFile {

	public List<String> getSymptoms(String path1);
}
