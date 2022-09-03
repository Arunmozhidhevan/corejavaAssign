package com.te.arraylist_manipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserMainCode {

	public static ArrayList<Integer> generateOddEvenList(ArrayList<Integer> list1, ArrayList<Integer> list2) {

		ArrayList<Integer> list3 = new ArrayList<Integer>(list1.size());
		int size = list1.size();

		for (int i = 0; i < list2.size(); i = i + 2) {
			int even = list2.get(i);
			list3.add(even);
		}
		for (int i = 1; i < list1.size(); i = i + 2) {
			list3.add(i, list1.get(i));
		}
		return list3;

	}
}
