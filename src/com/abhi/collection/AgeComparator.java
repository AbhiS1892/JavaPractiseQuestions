package com.abhi.collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<ComparatorExample> {

	@Override
	public int compare(ComparatorExample o1, ComparatorExample o2) {
		return o1.age-o2.age;
	}
	
	
}
