package com.te.oddevensum;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a positive Number");
		int n = scanner.nextInt();
		int result=UserMainCode.sum(n);
		if(result==1)
			System.out.println("yes");
		else
			System.out.println("No");
		
	}

}
