package com.te.max_admissions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.err.println("Enter the Map size:");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			int year = scanner.nextInt();
			int count = scanner.nextInt();
			map.put(year, count);
		}

		System.out.println(UserMainCode.getYear(map));
	}
}
