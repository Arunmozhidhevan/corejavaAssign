package com.te.remove_3_multiples;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the size :");
		int size  = scanner.nextInt();
		ArrayList<Integer> input = new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++) {
			input.add(scanner.nextInt());
		}
		ArrayList<Integer> list = UserMainCode.removeMultiplesOfThree(input);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
