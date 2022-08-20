package com.te.difference;

import java.util.Arrays;

//import sun.security.util.Length;

public class UserMainCode {
	
	static int getBigDiff(int arr[]) {
		int max = 0;
		int min = arr[0];
		int diff =0;
//		int temp;
//		Arrays.sort(arr);
//		int diff = arr[0]-arr[arr.length-1];
//		if(diff<0)
//			diff = arr[arr.length-1]-arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>max)
				max = arr[i];
		}
		
		for (int j =0; j < arr.length; j++) {
				if(arr[j]<min)	
					min = arr[j];
			}
		
		diff = max-min;
		return diff;
	}
}
