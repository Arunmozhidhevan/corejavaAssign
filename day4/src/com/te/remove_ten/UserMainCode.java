package com.te.remove_ten;

public class UserMainCode {

	static int[] removeTens(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 10)
				arr[i] = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i; j < arr.length; j++) {
					if (arr[j] != 0) {
						arr[i] = arr[j];
						arr[j] = 0;
						i++;
					}
				}
			}
		}

		return arr;
	}
}
