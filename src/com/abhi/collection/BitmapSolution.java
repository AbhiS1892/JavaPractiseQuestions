package com.abhi.collection;

public class BitmapSolution {

	static void printpairs(int arr[], int sum){
		final int max = arr.length*10;

		boolean[] bitmap = new boolean[max];
		
		
		for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
 
            // checking for condition
            if (temp>=0 && bitmap[temp])
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + temp +
                                    ", "+arr[i]+")");
            }
            bitmap[arr[i]] = true;
        }
	}
	
	public static void main(String[] args) {
		int A[] = {1, 4, 11, 6, 10, 8};
		int test[] = {2,6,7,1,14,9,8,3,4,8};
        int n = 16;
        printpairs(test,  16);
	}





}
