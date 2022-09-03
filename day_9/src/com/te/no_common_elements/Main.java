package com.te.no_common_elements;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of 1st Array :");
		int size1  = scanner.nextInt();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < size1; i++) {
			list1.add(scanner.nextInt());
		}
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter size of 2nd Array :");
		int size2 = scanner.nextInt();
		for (int i = 0; i < size2; i++) {
			list2.add(scanner.nextInt());
		}
		int [] result = UserMainCode.arrayListSubtractor(list1, list2);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
