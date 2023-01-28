package org.openmrs.module.financials.reporting.converter;

import org.openmrs.module.reporting.data.converter.DataConverter;

/** Gets any Object and counts the number of occurrences */
public class ObjectCounterConverter implements DataConverter {
	
	private int counter = 0;
	
	@Override
	public Object convert(Object obj) {
		if (obj != null) {
			counter++;
		}
		return counter;
	}
	
	@Override
	public Class<?> getInputDataType() {
		return String.class;
	}
	
	@Override
	public Class<?> getDataType() {
		return String.class;
	}
}
