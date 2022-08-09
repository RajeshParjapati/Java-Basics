package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestSotution {

	public static void main(String[] args) {
		
		List<Integer> ar1 = Arrays.asList(3,1,9,5,7);
		List<Integer> ar2 = Arrays.asList(2,0,8,6,3,4);
		List<Integer> result = new ArrayList<>();
		result.addAll(ar1);
		result.addAll(ar2);

		result = result.stream().map(x->x*5).distinct().sorted().collect(Collectors.toList());
		
		System.out.println(result);

	}
	
}
