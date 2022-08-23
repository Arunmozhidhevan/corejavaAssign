package com.te.check_character;

import java.util.StringTokenizer;

public class UserMainCode {

	static int checkCharacter(String str) {

		String array[] = str.split(" ");
		String first = "";
		String last = "";
		int len = array.length;
		if (array.length == 1) {
			int len1 = array[0].length();
			first = array[0].substring(0, 1);
			last = array[0].substring(len1 - 1);
		} else {
			System.out.println(array[len - 1]);
			first = array[0].substring(0, 1);
			last = (array[len - 1]).substring(array[len - 1].length() - 1);
			System.out.println(last);
		}
		if (first.equals(last))
			return 1;
		else
			return -1;

	}
}
