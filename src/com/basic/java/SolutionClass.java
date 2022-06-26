package com.basic.java;

import java.util.ArrayList;
import java.util.List;

public class SolutionClass {

	public static void main(String[] args) {
		
		System.out.println(MyInterface1.name);
		System.out.println(MyInterface1.getName());
		SolutionClass myclass = new SolutionClass();
		System.out.println( myclass.getIntgerValue());
		
		MyImplClass myImplClass =  new MyImplClass("rajesh","first");
		
		List<MyImplClass> myImp = new ArrayList<>();
		myImp.add(myImplClass);
		System.out.println(myImp);
		myImplClass.setEmail("second");
		System.out.println(myImp);
	}
	
	public int getIntgerValue() {
		
		class myInnerClass{
			int x;
			public myInnerClass() {
				System.out.println("From My inner class");
				this.x=1000;
			}
			
		}
		
		return new myInnerClass().x;
	}

}
