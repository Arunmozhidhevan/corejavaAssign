package com.te.largest_element;

import java.util.Arrays;
import java.util.Iterator;

public class UserMainCode {
	static int checkLargestAmongCorner(int arr[]) {
		
//		Arrays.sort(arr);
//		int largest = arr[arr.length-1];	
//		return largest;
		int max = 0;
		int first= arr[0];
		int middle = arr[arr.length/2];
		int last = arr[arr.length-1];
		
		int arr1[]= {first,middle,last};
		for(int i= 0; i<arr1.length;i++) {
			if(arr1[i]>max) {
				max= arr1[i];
			}
		}
			
		return max;
	}

}
