package com.abhi.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		System.out.println(a1.size());

		a1.add("Abhi");
		a1.add("AB");
		a1.add("ABC");
		
		System.out.println(a1.size());

		Iterator<String> i = a1.iterator();

		while(i.hasNext()){
			a1.remove(i);

		}
		System.out.println(a1.size());
		
//		for (String string : a1) {
//			System.out.println(string);
//		}
		
	}
}