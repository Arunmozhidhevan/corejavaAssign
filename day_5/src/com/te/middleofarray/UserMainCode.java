package com.te.middleofarray;

public class UserMainCode {

	static int getMilddleElement(int arr []) {
		int res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==arr[arr.length/2])
				res = res+arr[i];
		}
		
		return res;
	}
}
