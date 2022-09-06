package com.te.largest_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.err.println("Enter the Map size:");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			int key =scanner.nextInt();
			String value = scanner.next();
			map.put(key, value);
		}
		
		System.out.println(UserMainCode.getMaxValue(map));
	}
}
