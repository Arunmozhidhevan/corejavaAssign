package com.te.square_of_even;

import java.util.Scanner;

public class main extends UserMainCode{

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n = scanner.nextInt();
	
		System.out.println(sunOfSquareOfEvenDigits(n));
	}

}
