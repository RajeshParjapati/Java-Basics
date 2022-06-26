package com.basic.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


class CharacterCount{
	String names;
	long distinctCharacterCount;
	
	public CharacterCount(String names, long distinctCharacterCount) {
		super();
		this.names = names;
		this.distinctCharacterCount = distinctCharacterCount;
	}

	@Override
	public String toString() {
		return "CharacterCount [names=" + names + ", distinctCharacterCount=" + distinctCharacterCount + "]";
	}	
	
}

class Filter{
	public static Predicate<String> nameStartWithPrefix(String prefix){
		Predicate<String> str = x -> x.startsWith(prefix);
		return str;
	}
}

class Mapper{
	
	public static Function<String, CharacterCount> getDistinctCharactersCount(){
		Function<String, CharacterCount> mapperFunction = x-> CharacterCount(x, x.chars().distinct().count());
		return mapperFunction;
	}

	private static CharacterCount CharacterCount(String x, long count) {
		return new CharacterCount(x,count);
	}
}


public class PredicateAndFunction {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"aarjfdjsdsds",
				"sdfhsdh",
				"aaudsyfud",
				"aaaasdjfgjdsfxuil",
				"sdsdssdfkds"
				);
		
		names.stream().filter(Filter.nameStartWithPrefix("s"))
		.map(Mapper.getDistinctCharactersCount())
		.forEachOrdered(System.out::println);
	}
	

}
