package com.te.states_capitals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		System.err.println("Enter the Map size:");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			String key = scanner.next();
			String value = scanner.next();
			map.put(key, value);
		}
		System.out.println("Enter a capital :");
		String str = scanner.next();

		System.out.println(UserMainCode.getCapital(map, str));
	}
}
