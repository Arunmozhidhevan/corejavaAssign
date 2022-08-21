package com.te.median;

import java.util.Arrays;
import java.util.Iterator;

public class UserMainCode {

	static int calculateMedian(int arr[]) {

		Arrays.sort(arr);

		int med = 0;
		int result = 0;
		double dob = 0.0;
		int len = arr.length - 1;
		if (len % 2 == 0) {
			med = arr[len / 2];
			result = med;
		} else {
			double d1 = (double) arr[len / 2];
			double d2 = (double) arr[(len / 2) + 1];
			med = (int) (0.1 + Math.round((d1 + d2) / 2));
			result = med;
		}

		return result;
	}
}
