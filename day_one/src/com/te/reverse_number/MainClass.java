package com.te.reverse_number;

import java.util.Scanner;

public class MainClass extends UserMainCode {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a positive number");
		int n = scanner.nextInt();
		System.out.println(reverseNumber(n));
	}

}
