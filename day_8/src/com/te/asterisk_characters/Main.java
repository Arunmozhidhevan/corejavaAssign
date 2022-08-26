package com.te.asterisk_characters;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string  :");
		String str = scanner.next();
		System.out.println(UserMainCode.scanStarNeighbors(str));
	}
}
