package com.te.states_capitals;

import java.util.HashMap;
import java.util.Map;

public class UserMainCode {

	static String getCapital(Map<String, String> map, String str) {

		String res = map.get(str) + "$" + str;

		return res;
	}
}
