package com.basic.java.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s  = "12:00:00PM";
		
		System.out.println(timeConversion(s));

	}
	
	public static String timeConversion(String s) {
	    // Write your code here
	    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
	    LocalTime ald = LocalTime.parse(s, format);
	    System.out.println(ald.toString());
	    return ald.toString();
	  
	}

}
