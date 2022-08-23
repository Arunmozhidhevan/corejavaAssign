package com.te.middle;

public class UserMainCode {

	static String getMiddleChars(String str) {

		int len = str.length();
		String str1 = "";
		String str2 = str.substring((len / 2) - 1, (len / 2) + 1);

		return str2;
	}

}
