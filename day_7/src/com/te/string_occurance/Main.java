package com.te.string_occurance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings :");
		String s1 = scanner.next();
		String s2 = scanner.next();

		System.out.println(UserMainCode.getSubstring(s1, s2));
	}
}
