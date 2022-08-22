package com.te.largestelement;

public class UserMainCode {

	static int checkLargestAmongCorner(int arr[]) {
		
		
		int sum = 0;
		int lar = 0;
		for (int i = 0; i < arr.length; i++) {
			if((i==0)||i==(arr.length)/2||i==(arr.length-1)){
				if(lar<arr[i])
				lar = arr[i];
			
			}		
		}
		
		return lar;	
	}

}
