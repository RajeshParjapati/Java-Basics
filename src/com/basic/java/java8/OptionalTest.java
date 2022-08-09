package com.basic.java.java8;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
		String str = null;

		Optional<String> str1 = Optional.ofNullable(str);
		System.out.println(str1);
		
	}

}
