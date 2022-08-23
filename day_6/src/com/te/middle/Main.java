package com.te.middle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a string of even length :");
		String str = scanner.next();

		System.out.println(UserMainCode.getMiddleChars(str));
	}
}
