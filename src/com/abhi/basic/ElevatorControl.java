package com.abhi.basic;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ElevatorControl {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int key, value;
		Map<Integer, TreeSet<Integer>> upMap = new TreeMap<Integer, TreeSet<Integer>>();
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++){
			arr[i] = sc.nextInt();
		}
		
		int propleWaiting = sc.nextInt();
		
		for(int i = 0; i<10; i--) {
			key = Integer.parseInt(sc.next());
			value = Integer.parseInt(sc.next());

			if(key < value){
				if(upMap.containsKey(key)){
					TreeSet<Integer> tempArray = upMap.get(key);
					tempArray.add(value);
					upMap.put(key, tempArray);
				}else{
					TreeSet<Integer> tempArray = new TreeSet<>();
					tempArray.add(value);
					upMap.put(key, tempArray);
				}
			}
		}
		sc.close();

		Set<Integer> keySet = upMap.keySet();
		Integer[] array = keySet.toArray(new Integer[keySet.size()]);

		int optimizedTime = 0, maxElement = 0, maxLength = 0, powerDiff = 0;
		int powerConsumed = 100;

		if(array.length == 1){
			maxElement = Collections.max(upMap.get(array[0]));
			maxLength = upMap.get(array[0]).size();

			if(maxElement == maxLength){
				optimizedTime = (maxElement * 2) + 1;
				powerConsumed = powerConsumed + (20 * maxElement);
			}else{
				optimizedTime = maxElement + maxLength + 1;
				powerDiff = maxElement - maxLength;
				powerConsumed = powerConsumed + (20 * maxLength) + (10 * powerDiff);
			}

			System.out.println(optimizedTime+"\n"+powerConsumed);
		}else{
			for(Integer m : keySet){
				int tempMax = Collections.max(upMap.get(m));
				if(maxElement  < tempMax){
					maxElement = tempMax;
				}
			}

			maxLength = maxElement;
			for(int k=1; k<array.length; k++){
				if(upMap.get(array[0]).contains(array[k])){

					TreeSet<Integer> res = upMap.get(array[k]);
					Iterator<Integer> i = res.iterator();
					while(i.hasNext()){
						int temp = Collections.max(upMap.get(array[k]));
						int num = i.next();
						if(!(upMap.get(array[0]).contains(num)) && num < temp){				
							maxLength -= 1;
						}
					}
				}
			}

			System.out.println(maxLength);
			optimizedTime = maxElement + maxLength + 1;
			powerDiff = maxElement - maxLength;
			powerConsumed = powerConsumed + (20 * maxLength) + (10 * powerDiff);
			System.out.println(optimizedTime+"\n"+powerConsumed);
		}
	}
}

