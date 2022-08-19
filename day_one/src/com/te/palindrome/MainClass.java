package com.te.palindrome;

import java.util.Scanner;

public class MainClass extends  UserMainCode {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter 1st value");
	int x = scanner.nextInt();
	System.out.println("enter 2nd value");
	int y = scanner.nextInt();
	
	System.out.println(addPalindrome(x,y));
	
	}

}
