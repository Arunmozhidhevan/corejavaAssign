package com.te.list_sorting_merging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UserMainCode {

	public static ArrayList sortMergedArrayList(ArrayList list1, ArrayList list2) {
		
		list1.addAll(list2);
	
		Collections.sort(list1);
		
		ArrayList list3 = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			if(i==2||i==6||i==8)
				list3.add(list1.get(i));
		}
		
		return list3;
		
	}
}
