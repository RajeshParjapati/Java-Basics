package com.basic.dp;

public class FibonacciSeries {

	static final int MAX = 10000;
	static int[] fib = new int[MAX];

	public static void main(String[] args) {

		System.err.println(fibbonacci(5000));

	}

	public static int fibbonacci(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (fib[n] != 0)
			return fib[n];
		fib[n] = fibbonacci(n - 1) + fibbonacci(n - 2);
		return fib[n];
	}

}
