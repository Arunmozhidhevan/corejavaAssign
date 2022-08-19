package com.te.sum_of_odd;

import java.util.Scanner;

public class MainClass extends UserMainCode {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a positive number");
		int n =scanner.nextInt();
		if (n<0) {
			System.out.println("Enter a valid Number");
			n =scanner.nextInt();
				}
		System.out.println(checkSum(n));	

	}

}
