package com.googlecode.jcsv.annotations.processors;

import com.googlecode.jcsv.annotations.ValueProcessor;

/**
 * Processes integer values.
 *
 * @author Eike Bergmann
 *
 */
public class IntegerProcessor implements ValueProcessor<Integer> {
	/**
	 * Converts value into a integer using {@link Integer#parseInt(String)}
	 *
	 * @return Integer the result
	 */
	public Integer processValue(String value) {
		return Integer.parseInt(value);
	}
}
