package com.basic.algo.search;

public class FindFirstRepeatedChar {

	public static void main(String[] args) {
		String s = "hmpiimmmrajaptia hghjhhhjh";
		char[] a = s.toCharArray();
		char st = 0;
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					st=a[i];
					found=true;
					break;
				}
			}
			if(found)
				break;
		}
		System.out.println("first repeted char is = "+st);
	}

}
