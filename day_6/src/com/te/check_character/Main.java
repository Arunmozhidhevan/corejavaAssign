package com.te.check_character;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a string :");
		String str = scanner.nextLine();

		if (UserMainCode.checkCharacter(str) == 1)
			System.out.println("Valid");
		else
			System.out.println("Invlalid");
	}
}
