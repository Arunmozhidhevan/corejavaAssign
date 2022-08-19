package com.te.square_of_even;

public class UserMainCode {
	
	static int sunOfSquareOfEvenDigits(int n) {
		
		int sum=0;
		while(n>0) {
			
			int rem = n%10;
			if(rem%2==0)
				sum= sum+rem*rem;
			n=n/10;
		}
		
		return sum;
	}

}
