package com.te.state_id;

import java.util.HashMap;

public class UserMainCode {

	static HashMap<String, String> getStarted(String[] arr) {

		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i].substring(0, 3).toUpperCase(), arr[i]);
		}

		return map;

	}
}
