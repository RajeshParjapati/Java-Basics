package com.basic.algo.search;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		int n = a.length;
		BinarySearch bs = new BinarySearch();
		int x = bs.binarySearch(70, a,0,n-1);
		if(x==-1)
			System.out.println("element is not present .");
		else 
			System.out.println("element is :"+a[x] +" at index :"+x);
	}
	
	public int binarySearch(int key, int[] a, int l, int r) {
		if(r>=l) {
			int mid = l+(r-l)/2;
			if(a[mid]==key)
				return mid;
			if(a[mid]>key)
				return binarySearch(key, a, l, mid-1);
			return 	binarySearch(key, a, mid+1, r);
		}
		return -1;
	}

}
