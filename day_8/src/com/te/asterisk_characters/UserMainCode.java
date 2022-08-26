package com.te.asterisk_characters;

import java.util.Iterator;

public class UserMainCode {

	public static boolean scanStarNeighbors( String str) {
		String ast = "*";
		String  [] arr = str.split("\\*");
		
		boolean boo = false ;
		for (int i = 0; i < arr.length-1; i++) {
			
				if(arr[i].charAt(arr[i].length()-1)==arr[i+1].charAt(0))
					boo = true;	
		
		}
		return boo;	
	}
}
