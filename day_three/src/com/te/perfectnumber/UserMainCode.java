package com.te.perfectnumber;

public class UserMainCode {

	static boolean getPerfection(int n) {

		int count = 0;
		int sum = 0;

		for (int i = 1; i < n; i++) {

			if (n % i == 0)
				sum = sum + i;
		}
		return sum == n;
	}
}
