package com.te.digits;

import java.util.Scanner;

public class MainClass extends UserMainCode {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		System.out.println(countSeven(n));

	}

}
