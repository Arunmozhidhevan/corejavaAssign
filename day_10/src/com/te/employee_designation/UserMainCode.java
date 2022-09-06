package com.te.employee_designation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserMainCode {

	static List<String> obtainDesignation(Map<String, String> map, String str) {

		List<String> list = new ArrayList<String>();
		String str1 = map.get(map.get(1));
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (entry.getValue().equals(str))
				list.add(entry.getKey());
		}
		return list;

	}
}
