package com.abhi.collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> h1=new LinkedHashMap<Integer, String>();
		h1.put(101, "ABC");
		h1.put(111, "AC");
		h1.put(100, "AB");
		
		for(Entry<Integer, String> m:h1.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
