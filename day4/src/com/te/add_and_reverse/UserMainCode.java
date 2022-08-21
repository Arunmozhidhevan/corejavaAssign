package com.te.add_and_reverse;

import java.util.Iterator;

public class UserMainCode {

	static int addAndReverse(int arr[], int n) {

		int sum = 0;
		int rev = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > n) {
				sum = sum + arr[i];
			}
		}
		while (sum > 0) {
			int rem = sum % 10;
			rev = rev * 10 + rem;
			sum = sum / 10;
		}
		return rev;
	}

}
