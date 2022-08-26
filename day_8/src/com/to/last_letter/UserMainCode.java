package com.to.last_letter;

import java.util.Iterator;

public class UserMainCode {

	public static String getLastLetter(String str) {

		String[] arr = str.split(" ");
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			String temp = arr[i];
			res += temp.charAt(temp.length() - 1) + "$";
		}
		res = res.substring(0, res.length() - 1);
		res = res.toUpperCase();
		return res;
	}
}
