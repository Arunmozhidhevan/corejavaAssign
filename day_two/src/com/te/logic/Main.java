package com.te.logic;

import java.util.Scanner;

import com.te.digitsqaure.UserMainCode;

public class Main extends UserMainCodee {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a three numnbers");
		int n1 =scanner.nextInt();
		int n2 =scanner.nextInt();
		int n3 =scanner.nextInt();
		
		System.out.println(sum(n1,n2,n3));
	}
}
