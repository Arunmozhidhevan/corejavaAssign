package com.te.kaprekar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		int result = UserMainCode.getKaprekarNumber(n);
		if (result == 1)
			System.out.println("kaprekar number");
		else
			System.out.println("not a kaprekar number");
	}

}
