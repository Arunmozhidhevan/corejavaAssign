package com.te.sequence_in_array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size and elements :");
		int size = scanner.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		boolean boo = UserMainCode.searchSequence(arr);

		if (boo)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
