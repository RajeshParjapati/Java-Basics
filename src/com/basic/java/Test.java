package com.basic.java;

public class Test<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] a) {
		Test obj = new Test();
		obj.setT("Demo");
		obj.setT(10);
		obj.setT("%");
		System.out.println(obj.getT());
		
	}
}
