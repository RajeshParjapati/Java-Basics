package com.basic;

public class PrintTringle {

	public static void main(String[] args) {
		printTringle_(5);
		System.out.println("---------");
		printTringle_(3);
		System.out.println("---------");
		printTringle_(10);
	}
	
	public static void printTringle_(int n) {
		
		for(int i=1; i <=n; i ++) {
			
			for(int s=n-1; s>=i; s--) {
				System.out.print(" ");
			}
						
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
	}

}
