package com.te.no_common_elements;

import java.util.ArrayList;

public class UserMainCode {

	public static int[] arrayListSubtractor(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < list1.size(); i++) {
			 int count =0;
			for (int j = 0; j < list2.size(); j++) {
				if(list1.get(i)==list2.get(j)) {
					count++;
				}
			}
				if(count==0)
					list.add(list1.get(i));
		}
		
		for (int i = 0; i < list2.size(); i++) {
			 int count =0;
			for (int j = 0; j < list1.size(); j++) {
				if(list2.get(i)==list1.get(j)) {
					count++;
				}
			}
				if(count==0)
					list.add(list2.get(i));	
		}
		
		int arr[] = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= Integer.parseInt(list.get(i).toString());
		}
		 
		return arr;
		
	}
}
