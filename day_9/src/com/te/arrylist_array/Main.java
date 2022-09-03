package com.te.arrylist_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = scanner.nextInt();
		String arr[] = new String[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
		}
		ArrayList<String> list = new ArrayList<String>();
		for (int j = 0; j < arr.length; j++) {
			list.add(arr[j]);
		}
		Collections.sort(list);

		String[] str = UserMainCode.convertStringToArray(list);
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
		}

	}
}
