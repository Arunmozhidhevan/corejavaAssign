package com.te.remove_3_multiples;

import java.util.ArrayList;

public class UserMainCode {

	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> list){
		

		for (int i = 2; i < list.size(); i=i+2) {
			System.out.println("i value :"+i);
			list.remove(i);
			
			
		}
		
		return list;
		
	}
}
