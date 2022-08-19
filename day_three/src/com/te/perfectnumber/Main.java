package com.te.perfectnumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Positive Number");
		int n = scanner.nextInt();
		boolean b = UserMainCode.getPerfection(n);
		if (b)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");

	}

}
