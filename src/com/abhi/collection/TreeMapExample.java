package com.abhi.collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> h1=new TreeMap<Integer, String>();
		h1.put(101, "ABC");
		h1.put(111, "AB");
		h1.put(100, "AC");
		
		for(Entry<Integer, String> m:h1.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
