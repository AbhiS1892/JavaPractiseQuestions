package com.abhi.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<ComparatorExample>{

	@Override
	public int compare(ComparatorExample o1, ComparatorExample o2) {
		return o1.name.compareTo(o2.name);
	}

}
