package com.basic.java.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Java8Feature {
	
	public static void main(String[] args) {
		List<Ratings> mylist = new ArrayList<>();
		mylist.add(new Ratings("Red",300));
		mylist.add(new Ratings("Green",300));
		mylist.add(new Ratings("Green",400));
		mylist.add(new Ratings("YHHHY",500));
		mylist.add(new Ratings("Red",200));
		mylist.add(new Ratings("IKII",600));
		mylist.add(new Ratings("LOLO",700));
		mylist.add(new Ratings("LOLO",500));
		mylist.add(new Ratings("IKII",800));
		mylist.add(new Ratings("Red",700));
		mylist.add(new Ratings("LOLO",40));
		mylist.add(new Ratings("LOLO",350));
		mylist.add(new Ratings("YHHHY",4500));
		mylist.add(new Ratings("Red",560));
		mylist.add(new Ratings("Red",350));
		
		for(Ratings rt : mylist) {
			System.out.println(rt.getName() +"===="+rt.getWeight());
		}
		
		System.out.println(mylist);
		
		Map<String, Integer> myMap = new HashMap<>();
		myMap =  mylist.stream().collect(
				Collectors.groupingBy(
						Ratings::getName,Collectors.summingInt(Ratings::getWeight)));
		System.out.println(myMap);
		
		long count = mylist.stream().filter(r->r.getName().charAt(0)=='L').count();
		System.out.println(count);
		
		List<String> strList = mylist.stream().filter( r->r.getName().startsWith("L")).collect(Collectors.toList())
				.stream().map(r->r.getName()).collect(Collectors.toList()) ;
		
		List<String> strList1 = mylist.stream().filter( r->r.getName().startsWith("I")).collect(Collectors.toList())
		.stream().map(r->r.getName()).collect(Collectors.toList()) ;
		strList.addAll(strList1);
		System.out.println(strList);
		
		int a=10, b=12;
		
		int c = a>b?a:b;
		System.out.println(c);
		
		String str ="sdhfjksfdh";
		System.out.println(str);
		str = str.toUpperCase();
		System.out.println(str);

	}

}

class Ratings {
	
	private int weight;
	private String name;
	
	public Ratings() {}
	
	public Ratings( String name, int weight) {
		super();
		this.weight = weight;
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ratings [weight=" + weight + ", name=" + name + "]";
	}
	
	
}
