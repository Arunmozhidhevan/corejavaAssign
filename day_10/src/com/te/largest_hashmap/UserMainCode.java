package com.te.largest_hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UserMainCode {

	static String getMaxValue(Map map) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(map);

		return tmap.get(tmap.lastKey());
	}
}
