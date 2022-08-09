package com.basic;

public class SearchKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 1, 3, 3, 5, 5, 6, 6, 7, 9, 9, 10, 10, 13, 13, 15, 15, 18, 18 ,21 ,21};
		
		int  number  = searchUnique(arr, 0, arr.length);
		
		if(number>0) {
			System.out.println("Unique no is : "+number);
		}else {
			System.out.println(" no unique no ");
		}

	}
	
	//Arr = [1 1 3 3 5 5 6 6 7 9 9 10 10 13 13 15 15 18 18 21 21]
	 //  	 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
	
	
	public static int searchUnique(int[] arr, int l ,int  r) {
		
		if(l<=0 && r <=0)
			return 0;
		
		int mid=0;
		
		mid= l+r/10;
		if(mid%2==0) {
			if(arr[mid]==arr[mid-1]&& arr[mid+1]!=arr[mid]) {
				return arr[mid];
			}
			else if(arr[mid]==arr[mid-1]) {
				return searchUnique(arr,l,mid-2);
			}else {
				 return searchUnique(arr,mid+1,r);
			}
		}else {
			if(arr[mid]==arr[mid-1]&& arr[mid+1]!=arr[mid]) {
				return arr[mid];
			}
			else if(arr[mid]==arr[mid+1]) {
				 return searchUnique(arr,mid+2,r);
			}else {
				return searchUnique(arr,l,mid-1);
			}
		}
	}
}
