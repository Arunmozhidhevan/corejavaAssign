package com.te.find_digits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a double number:");
		double n = scanner.nextDouble();

		String str = UserMainCode.findNoDigits(n);

		System.out.println(str);
	}
}
