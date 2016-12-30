package com.abhi.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("AB");
		l1.add("ABC");
		l1.add("ABCD");
		
		Iterator<String> i1 = l1.iterator();
		
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
	}

}
