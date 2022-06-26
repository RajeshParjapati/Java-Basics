package com.basic.java;

public class MyImplClass implements MyInterface1, MyInterface2 {
	
	public MyImplClass() {}

	public MyImplClass(String name1, String email) {
		super();
		this.name1 = name1;
		this.email = email;
	}
	
	@Override
	public void m1() {
		System.out.println("Hello from IMPL class");
	}
	
	private String name1;
	private String email;
	
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MyImplClass [name1=" + name1 + ", email=" + email + "]";
	}
	
	
	
}
