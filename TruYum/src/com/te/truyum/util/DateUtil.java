package com.te.truyum.util;


import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class DateUtil {

		static LocalDate convertToDate(String date) {
		
		LocalDate loacDate = LocalDate.parse(date);
		

		return loacDate;
		
	}
}
