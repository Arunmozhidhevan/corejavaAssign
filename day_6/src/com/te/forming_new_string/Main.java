package com.te.forming_new_string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a string and number:");
		String str = scanner.next();
		int num = scanner.nextInt();

		System.out.println(UserMainCode.formNewWord(str, num));
	}
}
