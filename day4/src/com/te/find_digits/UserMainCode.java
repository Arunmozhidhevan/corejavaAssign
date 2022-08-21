package com.te.find_digits;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class UserMainCode {

	static String findNoDigits(double dou) {

		String str = Double.toString(dou);
		int n = str.indexOf(".");

		String str1 = str.substring(0, n);
		String str2 = str.substring(n + 1);

		int modi = Integer.parseInt(str2);

		for (int i = 0; i < str2.length(); i++) {
			int rem = modi % 10;

			if (rem == 0)
				modi = modi / 10;

			str2 = Integer.toString(modi);
		}
		int len1 = str1.length();
		int len2 = str2.length();

		String res1 = Integer.toString(len1);
		String res2 = ":";
		String res3 = Integer.toString(len2);
		String result = res1 + res2 + res3;

		return result;
	}
}
