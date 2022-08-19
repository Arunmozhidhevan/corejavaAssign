package com.te.palindrome;

public class UserMainCode {

static int addPalindrome(int x,int y) {
	
	int pSum=0;
	for(int i=x;i<=y;i++) {
		int t=i;
		int sum =0;
		int temp=i;
		while(t>0) {
			
			int rem = t%10;
			sum = sum*10+rem;
			t = t/10;
		}
		if(temp==sum)
			pSum=pSum+sum;		
	}
	
	return pSum;	
}
	
}
