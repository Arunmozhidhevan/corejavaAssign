package com.te.arrylist_array;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {

	public static String[] convertStringToArray(ArrayList<String> list) {

		String arr1[] = new String[list.size()];

		for (int j = 0; j < list.size(); j++) {
			String str = list.get(j).toString();
			arr1[j] = str;
		}

		return arr1;

	}
}
