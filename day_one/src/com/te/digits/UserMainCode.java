package com.te.digits;

public class UserMainCode {
	
	static int countSeven(int n) {
		int count =0;
		while(n>0) {
			
			int rem= n%10;
			if(rem==7)
				count++;
			n=n/10;
		}
		return count;
	}

}
