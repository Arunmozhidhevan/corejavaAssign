package com.te.sum_of_power_of_arrayelements;

public class UserMainCode {
	static int logic(int value, int n) {
		int product = 1;
		
		for(int i = 0; i<n;i++) {
			
			product = product*value;
		}
		return product;
	}
	
	static int getSumOfPower(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length;i++){
			sum = sum+ UserMainCode.logic(arr[i], i);
		}
		
		return sum;
	}
}
