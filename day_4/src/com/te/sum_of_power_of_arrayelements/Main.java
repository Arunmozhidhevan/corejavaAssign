package com.te.sum_of_power_of_arrayelements;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Size of Array");
	int size = scanner.nextInt();
	int[] arr = new int [size];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = scanner.nextInt();		
		}
	
	System.out.println(UserMainCode.getSumOfPower(arr));
 }
}
