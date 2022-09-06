package com.te.state_id;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = scanner.nextInt();
		String arr[] = new String[size];
		for (int i = 0; i < size; i++) {

			arr[i] = scanner.next();

		}
		HashMap<String, String> map = UserMainCode.getStarted(arr);
		Set set = map.entrySet();
		// System.out.println("set "+set);
		Set<String> key = map.keySet();
		List<String> keyList = new ArrayList<String>(key);
		Collection<String> coll = map.values();
		List<String> vallist = new ArrayList<String>(coll);
		for (int i = 0; i < key.size(); i++) {
			System.out.println(keyList.get(i) + ":" + vallist.get(i));
		}

	}
}
