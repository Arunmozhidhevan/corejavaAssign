package com.te.fibanacci;

public class UserMainCode {
	
	/*static int getSumOfNfibos(int n) {
		int sum=0;
		if(n==1)
			return 0;
		else if(n==2||n==3)
			return 1;
		else {
			for (int i=1;i<=n;i++) {
			 sum=sum+getSumOfNfibos(n-1)+getSumOfNfibos(n-2);
			 
			}
		}
		return sum;*/
		
		static int  getSumOfNfibos(int n) {
			int fSum =1; 
			int a=0;
			int b=1;
			int c= 0;
			
			for(int i=1;i<=n-2;i++) {
				c=a+b;
				a=b;
				b=c;
				fSum=fSum+c;
				
			}
			return fSum;
	}

}
