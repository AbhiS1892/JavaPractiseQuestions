package com.abhi.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void printSumPairs(int []input, int k){
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for(int i=0;i<input.length;i++){

			if(pairs.containsKey(k-input[i])){
				System.out.println(pairs.get(k-input[i]) +", "+ input[i]);
				break;
			}else
				pairs.put(input[i], input[i]);
		}

	}

	public static void main(String[] args) {
		HashMap<Student, Student> h1 = new HashMap<Student, Student>();
		h1.put(new Student("TOM", 124), new Student("TOM", 124));
		h1.put(new Student("TOM", 124), new Student("TOM", 124));

		/*		HashMap<String, String> h2=new HashMap<>();
		h2.put("1","1");
		h2.put("1","2");
		h2.put("1","3");
		h2.put("1","4");
		h2.put("1","5");*/

		/*for(Student e:h1.keySet()){
			System.out.println(h1.get(e));
		}*/

		//		h2.remove("1");
		//		System.out.println(h2.get(1));
		//		System.out.println(h2.size());



		//		System.out.println(h1.size());


		for(Student m:h1.keySet()){
			System.out.println(h1.get(m));
		}

		//		int test[] = {2,6,7,1,9,8,3,4};
		//		printSumPairs(test, 10);
	}

}
