package com.te.kaprekar;

public class UserMainCode {

	static int getKaprekarNumber(int n) {

		int x = n * n;
		int y = n * n;
		int count = 0;
		int right = 0;
		int left = 0;
		int z = 1;
		int result = 0;
		while (x > 0) {
			int rem = x % 10;
			count++;
			x = x / 10;
		}
		System.out.println(y);
	    System.out.println(count);	
		for (int i = 1; i <= (count / 2); i++) {
			
			z = z * 10;
		}
		
		System.out.println(z);
		if(count%2!=0) {
			
			left = y % (z*10);
			right = y / (z*10) ;
			System.out.println(left);
			System.out.println(right);
			
			if(left != right) {
				
				left = y % z;
				right = y / z;
				System.out.println("22");
			}	
		}
		else {
			
		left = y % z;
		right = y / z;
		System.out.println(" 3");
		}

		if (left + right == n)
			return 1;
		else
			return -1;
	}
	   
	

}
