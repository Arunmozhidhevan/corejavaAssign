package com.te.vowvels_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the size :");
		int size  = scanner.nextInt();
		String arr[] = new String[size];
		for (int i = 0; i < size; i++) {
			arr[i]=scanner.next();
		}
		
		ArrayList list = UserMainCode.matchChacter(arr);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
