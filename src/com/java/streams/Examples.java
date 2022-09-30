package com.java.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples {

	public static void main(String[] args) {

		//Converting Stream of String to Array of String
		Stream<String> tokenStream = Arrays.asList("A", "B", "C", "D").stream();  //stream
	     
		String[] tokenArray = tokenStream.toArray(String[]::new);   //array
		 
		System.out.println(Arrays.toString(tokenArray));
		
		//Infinite stream of Integers
		int[] intArray = IntStream.iterate(1, i -> i+1).limit(10).toArray();
		System.out.println(Arrays.toString(intArray));
	}

}
