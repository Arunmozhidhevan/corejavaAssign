package com.te.position_reversed_array;

import java.util.Arrays;
import java.util.Iterator;

public class UserMainCode {

	static int getElementsPosition(String[] sarr, String str) {

//		for (int i = 0; i < sarr.length - 1; i++) {
//			for (int j = i+1; j < sarr.length; j++) {
//				if (sarr[i].compareTo(sarr[j]) > 0) {
//
//					String temp = sarr[i];
//					sarr[i] = sarr[j];
//					sarr[j] = temp;
//				}
//			}
//		}
		String narr[] = new String[sarr.length];
		for (int i = 0; i < narr.length; i++) {
			narr[i] = sarr[narr.length - i - 1];
		}

		int res = 0;
		for (int i = 0; i < narr.length; i++) {
			if (narr[i].equals(str))
				res = i + 1;
		}

		return res;
	}
}
