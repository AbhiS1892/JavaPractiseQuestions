package com.abhi.collection;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> h1=new Hashtable<Integer, String>();
		h1.put(101, "ABC");
		h1.put(112, "ABV");
		h1.put(110, "ABD");
		h1.put(111, "AB");
		h1.put(115, "ABC");
		
		for(Entry<Integer, String> e:h1.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
