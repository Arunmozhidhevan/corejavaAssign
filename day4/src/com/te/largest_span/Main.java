package com.te.largest_span;

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

		System.out.println(UserMainCode.getLargestSpan(arr));
	}

}
