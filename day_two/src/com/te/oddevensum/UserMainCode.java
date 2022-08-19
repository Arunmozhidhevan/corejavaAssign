package com.te.oddevensum;

public class UserMainCode {
	
	static int sum(int n) {
		
		int evenSum=0;
		int oddSum=0;
		int count=0;
		int temp=n;
		int temp2=n;
		
		while (n>0) {
			
			int rem= n%10;
			n=n/10;
			count++;
			
		}
		// System.out.println(count);
		
		while(temp>0) {
			
		int r =temp%10;
		evenSum=evenSum+r;
		temp=temp/100;
		}
	//	System.out.println(evenSum);
		
		temp2=temp2/10;
		
		while(temp2>0) {
			int r1=temp2%10;
			oddSum=oddSum+r1;
			temp2=temp2/100;
			
		}
	if(oddSum==evenSum)
		return 1;
	else
		return -1;
}
}
