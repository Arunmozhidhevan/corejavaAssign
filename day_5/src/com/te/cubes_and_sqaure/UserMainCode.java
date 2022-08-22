package com.te.cubes_and_sqaure;

public class UserMainCode {

	static int addEvenOdd(int arr[]) {
			int sum1 =0;
			int sum2 = 0;
			int sum =0;
			int res = 0;
			int forEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==1) {
				 sum1 = arr[i]*arr[i]*arr[i];
				 sum = sum + sum1;
			}
			else {
				sum2= arr[i]*arr[i];		
				sum = sum + sum2 ;
			}
		}
		return sum;
	}
}
