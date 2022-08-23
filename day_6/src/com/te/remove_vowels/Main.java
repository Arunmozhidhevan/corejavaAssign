package com.te.remove_vowels;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a string and number:");
		String str = scanner.next();

		System.out.println(UserMainCode.removeEvenVowels(str));
	}
}
