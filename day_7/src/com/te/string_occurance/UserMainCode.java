package com.te.string_occurance;

import java.util.Iterator;

public class UserMainCode {

	static int getSubstring(String s1, String s2) {

		int len2 = s2.length();
		int count = 0;
		for (int i = 0; i < s1.length() - 2; i++) {

			String temp = s1.substring(i, i + len2);

			if (temp.equals(s2))
				count++;
		}

		return count;
	}
}
