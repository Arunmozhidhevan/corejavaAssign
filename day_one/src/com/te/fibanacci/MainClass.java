package com.te.fibanacci;

import java.util.Scanner;

public class MainClass extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the position");
		int n= scanner.nextInt();
		System.out.println(getSumOfNfibos(n));
			
	}
}
