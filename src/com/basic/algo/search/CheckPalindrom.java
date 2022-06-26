package com.basic.algo.search;

public class CheckPalindrom {

	public static void main(String[] args) {
		checkPalindrom(121);
		checkPalindrom(21212);
		checkPalindrom(1121);

	}
	
	public static void checkPalindrom(int n){
		int m =n;
		int sum=0;
		while(m>0){
			int r =m%10;
			sum =sum*10 + r;
			m=m/10;
		}
		if(sum==n)
			System.out.println(n+" is Palindrom " + sum);
		else
			System.out.println(n+" is not a Palindrom " + sum);
	}

}
