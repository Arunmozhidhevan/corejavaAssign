package com.te.unique;

public class UserMainCode {
	
	static int getUnique(int n) {
		int rcount=0;
		while(n>0) {
			int rem= n%10;
			while (n>0) {
				int rep = n%10;
				if(rem==rep)
					rcount++;
				n=n/10;
			}
			n=n/10;
		}
		if(rcount>=2)
			return -1;
		else
			return 1;	
	}

}
