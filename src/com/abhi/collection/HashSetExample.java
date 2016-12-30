package com.abhi.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> h1=new HashSet<String>();
		h1.add("ABC");
		h1.add("AB");
		h1.add("ABCD");	
		
		h1.contains("ABC");
		
		Iterator<String> i = h1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}

}
