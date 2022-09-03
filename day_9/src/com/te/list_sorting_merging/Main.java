package com.te.list_sorting_merging;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" enter 5 elements of arraylist-1 :");
		ArrayList list1 = new ArrayList();
		for (int i = 0; i < 5; i++) {
			list1.add(scanner.nextInt());
		}
		System.out.println(" enter 5 elements of arraylist-1 :");
		ArrayList list2 = new ArrayList();
		for (int i = 0; i < 5; i++) {
			list2.add(scanner.nextInt());
		}
		ArrayList result = UserMainCode.sortMergedArrayList(list1, list2);
		for (int i = 0; i < 3; i++) {
			System.out.println(result.get(i));
		}

	}
}
