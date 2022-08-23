package com.te.forming_new_string;

public class UserMainCode {

	static String formNewWord(String str, int num) {

		String res = "";
		String first = str.substring(0, num);
		String last = str.substring(str.length() - num);
		// System.out.println(first);
		// System.out.println(last);
		res = first + last;

		return res;
	}
}
