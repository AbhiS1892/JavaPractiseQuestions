package com.abhi.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("Abhi");
		a1.add("AB");
		a1.add("ABC");

		ListIterator<String> i = a1.listIterator(0);

		System.out.println("Traversing list from forward");
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println("Traversing list from backward");
		
		while(i.hasPrevious()){
			System.out.println(i.previous());
		}
	}

}
