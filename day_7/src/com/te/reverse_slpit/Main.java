package com.te.reverse_slpit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a string and character :");
		String str = scanner.next();
		String ch = scanner.next();

		System.out.println(UserMainCode.reshape(str, ch));
	}
}
