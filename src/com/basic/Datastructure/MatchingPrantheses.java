package com.basic.Datastructure;

import java.util.Stack;

public class MatchingPrantheses {

	public static void main(String[] args) {
		
		String str = "[{{((([])))}}]";
		
		boolean match = match(str);
		
		System.err.println(match);

	}
	
	public static boolean match(String str) {
		
		if(str==null || str.length()==0) return true;
		Stack<Character> charStack = new Stack<>();
		char[] charArr = str.toCharArray();
		for(char current : charArr) {
			if(current== '['|| current =='{' || current=='(') {
				charStack.push(current);
			}else if (charStack.isEmpty()) return false;
			else {
				char pop = charStack.pop();
				if(pop=='['&& current!=']') return false;
				if(pop=='{'&& current!='}') return false;
				if(pop=='('&& current!=')') return false;
			}
		}
		if(!charStack.isEmpty()) return false;
		return true;	
	}

}
