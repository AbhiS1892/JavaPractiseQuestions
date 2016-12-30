package com.abhi.basic;

class MergeSort
{
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int [n1];
		int R[] = new int [n2];

		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[m + 1+ j];


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r)
	{
		if (l < r)
		{
			// Find the middle point
			int m = (l+r)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr , m+1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	/* A utility function to print array of size n */
	static int[] printArray(int arr[])
	{
		int n = arr.length;
		int[] arr2 = new int[5];
		int min = arr[n-1];
		int f = 0;
		int l = f + 5 - 1;
		int diff = 0;
		for (int i=0; i<n; i++){
			if(i+4 < n){
				diff = arr[i+l]-arr[i];
			}else{
				break;
			}
			if(diff<min){
				min = diff;
				f = i;
				l = f + 5 -1;
			}

		}
		int k=0;
		for(int j=f;j<=l;j++){
			
			arr2[k]=arr[j];
			k++;
		}
		return arr2;
	}

	// Driver method
	public static void main(String args[])
	{
		int arr[] = {73,6,9,2,11,14,13};

//		System.out.println("Given Array");
//		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length-1);

		System.out.println("\nSorted array");
		int arr2[] =printArray(arr);
		for(int i=0; i<arr2.length;i++){
			System.out.print(arr2[i] + " ");
		}
	}
}