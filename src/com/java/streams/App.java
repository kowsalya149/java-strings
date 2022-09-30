package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		//Stream.of()
		Stream<String> stream = Stream.of("aa","ss","zz");
		stream.forEach(p -> System.out.println(p));
		
		//Stream.of(array)
		Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4,5,6});
		stream1.forEach(s -> System.out.println(s));
		
		//List.stream()
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<5; i++) {
			list.add(i);
		}
		Stream<Integer> stream2 = list.stream();
		stream2.forEach(l -> System.out.println(l));
		
		//Stream.iterate()
		//Stream.iterate(initial value, next value)
		Stream.iterate(11, n->n+1).limit(5).forEach(i -> System.out.println(i));
		
		//Stream.generate()
		Stream<Integer> stream3 = Stream.generate(() -> (new Random()).nextInt(100));
		stream3.limit(5).map(e -> e * 10).forEach(s -> System.out.println(s));
		System.out.println();
		
		//Stream of String chars or tokens
		IntStream stream4 = "a123_sd".chars();
		stream4.forEach(p -> System.out.println(p));
		
		Stream<String> stream5 = Stream.of("A@B@C".split("\\@"));
		stream5.forEach(s -> System.out.println(s));
		
		//Collect Stream elements to a List
		List<Integer> list1 = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			list1.add(i);
		}
		Stream<Integer> stream6 = list1.stream();
		List<Integer> evenNumList = stream6.filter(i -> (i%2 == 0)).collect(Collectors.toList());
		System.out.println(evenNumList);
		
		//sum of stream elements
		System.out.println("using reduce");
		//Integer add = evenNumList.stream().reduce(0, Integer::sum);
		Integer add = evenNumList.stream().reduce(0, (a, b) -> a + b);
		System.out.println(add);
		
	}

}