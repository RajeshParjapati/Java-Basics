package com.basic.Datastructure;


import java.util.Arrays;
import java.util.LinkedList;

public class JavaLinkedListTest {

	public static void main(String[] args) {
		
		/*LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4,5,7,7,78,98,58,668,88,938,989,448,768));
		System.out.println(ll);
		int k=5;
		for(int i=0; i<k;i++){
			int lastIndex = ll.size();
			int num = ll.get(lastIndex-1);
			ll.remove(lastIndex-1);
			System.out.println(num);
			ll.addFirst(num);
		}
		
		System.out.println(ll);*/
		
		int k =2;
		
		int[] arr = {1,2,3,4,5};
		int[] res = new int[arr.length];
		int len = arr.length;
		for(int i=k-1; k>=0; i--) {
			res[i]=arr[len-1];
			len--;
		}
		int j=0;
		for(int i=k; i<arr.length; i++) {
			res[i]= arr[j];
			j++;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
		
	
	}

}
