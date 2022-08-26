package com.te.test_vowvels;

public class UserMainCode {

	public static String testVowels(String str) {

		String vow = "aeiou";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vow.length(); j++) {
				if (str.charAt(i) == vow.charAt(j))
					count++;
			}
		}
		if (count >= 5)
			return "Yes";
		else
			return "No";
	}
}
