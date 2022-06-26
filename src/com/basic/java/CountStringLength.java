package com.basic.java;

import java.util.ArrayList;

public class CountStringLength {

	public static void main(String[] args) {
		String str1 = "While fixing the long-pending or legacy coding issue. Implemented the proven design principle that provides an optimized and performance-based solution.\r\n" + 
				"\r\n" + 
				"Created the JWT Utils and SPT APIs that can be used across the storefront and properly documented it in confluence.\r\n" + 
				"Improved the coding standards by addressing review comments as a developer and giving better comments as a reviewer to avoid any bug.";		
		
		ArrayList<String> al = new ArrayList<>();
		al.add("dhfds");
		al.add("kdjhfjhsd");
		System.out.println(al.get(0));
		
		
		
		System.out.println(str1.length());

	}

}
