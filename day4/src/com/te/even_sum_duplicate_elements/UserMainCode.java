package com.te.even_sum_duplicate_elements;

import java.util.Iterator;

public class UserMainCode {

	static int sumElements(int arr[]) {
		int sum = 0;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					arr[j] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] != 0)
				sum = sum + arr[i];
		}
		if (sum == 0)
			result = -1;
		else
			result = sum;
		return result;
	}
}