package com.te.arraylist_manipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = scanner.nextInt();

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			list1.add(scanner.nextInt());
		}
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			list2.add(scanner.nextInt());
		}
		ArrayList<Integer> result = UserMainCode.generateOddEvenList(list1, list2);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
