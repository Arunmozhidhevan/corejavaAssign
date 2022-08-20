package com.te.average_of_prime;

import java.text.DecimalFormat;

public class UserMainCode {

	static double averageElements(int [] arr) {
		int sum = 0;
		int count = 0;
		int pcount =0;
		//double res;
		for (int i = 0; i < arr.length; i++) {
			count =0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0)
					count++;
			}
				if(count==2) {
					pcount++;
					sum = sum + arr[i];
			}	
		}
		
		double res = (double)sum/pcount;
		DecimalFormat df = new DecimalFormat("#.00");
		Double result = Double.parseDouble(df.format(res));
		return result;	
	}
}
