package com.basic.java.java8;

import java.util.Arrays;
import java.util.List;

public class MaxMinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = Arrays.asList(1,2,3,4,5);
		miniMaxSum(al);
	}
	
	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
		
		int maxl= arr.stream().max(Integer::compare).get();
		int miniL= arr.stream().min(Integer::compare).get();
		long sum1 = arr.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println((sum1-maxl) +" "+ (sum1-miniL));
		
	    int max=0, min=0;
	    max=arr.get(0);
	    min=arr.get(0);
	    long sum=arr.get(0);
	    for (int i=1; i<arr.size(); i++) {
	        if(max<arr.get(i))
	            max=arr.get(i);
	        if(min>arr.get(i))
	            min=arr.get(i);
	        sum = sum + arr.get(i);
	       
	    }
	    //System.out.println(max);
	    //System.out.println(min);
	    System.out.println((sum-max) +" "+ (sum-min));
	}

}
