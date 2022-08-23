package com.te.position_reversed_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a size and elements :");
		int size = scanner.nextInt();
		String sarr[] = new String[size];

		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = scanner.next();
		}
		Arrays.sort(sarr);
		System.out.println(" enter a array element");
		String str = scanner.next();
		System.out.println(UserMainCode.getElementsPosition(sarr, str));
	}
}
