package com.te.common_elements;

public class UserMainCode {

	static int sumCommonElements(int[] arr1, int[] arr2) {

		int sum = 0;

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					sum = sum + arr1[i];
				}
			}
		}

		return sum;

	}
}
