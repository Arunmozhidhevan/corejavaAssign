package com.te.palying_with_string;

public class UserMainCode {

	static String formString(String arr[], int num) {

		String res = "";
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].length() >= num) {

				String str = arr[i].substring(arr[i].length() - 1);
				res = res + str;
			} else
				res = res + "$";

		}

		return res;
	}
}
