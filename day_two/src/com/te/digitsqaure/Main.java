package com.te.digitsqaure;

import java.util.Scanner;

public class Main {
	 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a Positive Number");
		int n =scanner.nextInt();
		
		System.out.println(UserMainCode.sum(n));
		
	}

}
