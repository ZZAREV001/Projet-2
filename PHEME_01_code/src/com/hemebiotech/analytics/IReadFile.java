package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source file.
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications.
 */

public interface IReadFile {
	/**
	 * Abstract data type: read txt file into a list of string.
	 * @param path1 path of the file in our local storage
	 * @return list of strings
	 */
	public List<String> getSymptoms(String path1);
}
