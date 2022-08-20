package com.te.common_elements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of 1st array:");
		int size1 = scanner.nextInt();
		int arr1[] = new int [size1];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		System.out.println("Enter the size of2nd array:");
		int size2 = scanner.nextInt();
		int arr2[] = new int [size2];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scanner.nextInt();
		}
		 System.out.println(UserMainCode.sumCommonElements(arr1, arr2));
}
}
