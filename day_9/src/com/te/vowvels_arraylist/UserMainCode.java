package com.te.vowvels_arraylist;

import java.util.ArrayList;

public class UserMainCode {

	public static ArrayList matchChacter(String arr[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			if((arr[i].charAt((arr[i].length())-1))=='a' || (arr[i].charAt((arr[i].length())-1))=='e' || (arr[i].charAt(arr[i].length()-1))=='i' || (arr[i].charAt(arr[i].length()-1))=='o' || (arr[i].charAt(arr[i].length()-1))=='u')
			if((arr[i].charAt(0)=='a'||arr[i].charAt(0) =='e'||arr[i].charAt(0)=='i'||arr[i].charAt(0)=='o'||arr[i].charAt(0)=='u'))
				list.add(arr[i]);
		}
		return list;
		
	}
}
