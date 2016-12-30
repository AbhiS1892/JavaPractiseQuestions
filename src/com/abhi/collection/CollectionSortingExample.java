package com.abhi.collection;

import java.util.*;

public class CollectionSortingExample {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(Integer.valueOf(5));
		a1.add(2);
		a1.add(Integer.valueOf(1));
		
	    Collections.sort(a1);
	    
	    Iterator<Integer> i=a1.iterator();
	    while(i.hasNext()){
	    	System.out.println(i.next());
	    }
		

	}

}
