package com.te.employee_designation;

import java.util.HashMap;
import java.util.List;
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
		String str = scanner.next();
		List<String> list1 = UserMainCode.obtainDesignation(map, str);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

	}
}
