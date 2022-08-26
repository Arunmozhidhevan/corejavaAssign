package com.te.repeat_front;

public class UserMainCode {

	public static String repeatFirstThreeCharacters(String str, int num) {

		String res = "";

		if (str.length() < 3) {
			for (int i = 0; i < num; i++) {
				res = res + str;
			}

		} else {
			String sub = str.substring(0, 3);
			for (int i = 0; i < num; i++) {
				res = res + sub;
			}
		}

		return res;
	}
}
