package com.basic.algo.search;

public class NumberLineJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kangaroo(2564, 5393 ,5121, 2836));
		System.out.println(kangaroo(0, 3, 4, 2));
		
	}
	
	public static String kangaroo(int x1, int v1, int x2, int v2) {
	    // Write your code here
		 if ((v1 > v2) && ((x2 - x1) % (v2 - v1)) == 0)
		      return "YES";
		 else
		      return "NO";
	}

}
