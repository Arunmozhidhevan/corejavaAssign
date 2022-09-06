package com.te.max_admissions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

public class UserMainCode {

	static Integer getYear(Map<Integer, Integer> map) {

		Optional<Entry<Integer, Integer>> max = map.entrySet().stream().max(
				(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) -> e1.getValue().compareTo(e2.getValue()));

		return max.get().getKey();
	}
}
