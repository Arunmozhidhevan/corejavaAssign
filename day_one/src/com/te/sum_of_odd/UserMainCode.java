package com.te.sum_of_odd;

public class UserMainCode {
	
	 static int checkSum(int n) {
		 int even = 0;
		 int odd = 0;
		 int result;
			
		 while (n > 0) {
				int rem = n % 10;
				if(rem%2==0)
				even = even + rem;
				else
				odd = odd +rem;	
				n = n / 100;
		 	}
		// System.out.println(odd);
         if(odd%2==0&&odd>0) {
        	 result=-1;
        	 return result;
         }
         else if(odd==0) {
        	 result =0;
             return result;
         }
         else {
        	 result = 1;
        	 return result;
         }
		 
	 }
	
	

}
