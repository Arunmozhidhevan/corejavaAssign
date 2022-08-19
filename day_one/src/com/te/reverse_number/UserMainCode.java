package com.te.reverse_number;

public class UserMainCode {
	
	static int reverseNumber(int n) {
		int sum=0;
		while(n>0) {
			int rem = n%10;
			sum = sum*10+rem;
			n=n/10;
			
		}	
		return sum;	
	}

}
