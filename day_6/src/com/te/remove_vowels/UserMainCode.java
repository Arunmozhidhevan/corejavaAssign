package com.te.remove_vowels;

import java.util.Iterator;

public class UserMainCode {

	static String removeEvenVowels(String str) {

		int pos = str.length();
		String res = "";

		for (int i = 0; i < pos; i++) {

			String check = str.substring(i, i + 1);

			if ((check.equals("a") || check.equals("e") || check.equals("i") || check.equals("o") || check.equals("u"))
					&& i % 2 == 1)
				res = res + "";
			else
				res = res + check;

		}
		return res;

	}
}
