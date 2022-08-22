package com.te.boundaryaverage;

import java.util.Iterator;

public class UserMainCode {
	
	static float getBoundaryAverage(int arr []) {
		
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println(max);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println(min);
		 float dou = (float)(max+min)/2;
				 
		return dou;	
	}

}
