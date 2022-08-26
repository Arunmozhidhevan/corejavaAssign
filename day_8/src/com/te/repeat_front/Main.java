package com.te.repeat_front;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string  :");
		String str = scanner.next();
		System.out.println("Enter a Number");
		int num = scanner.nextInt();

		 System.out.println(UserMainCode.repeatFirstThreeCharacters(str,num));
	}
}
