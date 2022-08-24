package com.te.reverse_slpit;

import java.util.Iterator;

public class UserMainCode {

	static String reshape(String str, String ch) {

		String string = "";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			string = string + (str.charAt(str.length() - i - 1));
		}

		for (int i = 0; i < str.length(); i++) {
			res = res + string.charAt(i) + ch;
			// System.out.println(string.charAt(i));
		}
		String result = res.substring(0, res.length() - 1);

		return result;
	}

}
