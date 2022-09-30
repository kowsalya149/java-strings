package com.java.strings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashsetDemo {

	 public static void main(String[] args) {
		
		 Set<Integer> set1 = new HashSet<Integer>();
		 set1.add(11);
		 set1.add(22);
		 set1.add(33);
		 
		 Set<Integer> set2 = new HashSet<Integer>();
		 set2.add(44);
		 set2.add(55);
		 set2.add(66);
		 
		 Set<Integer> set3 = new HashSet<Integer>();
		 set3.add(10);
		 set3.add(20);
		 set3.add(30);
		 
		 System.out.println(Stream.of(set1, set2, set3).flatMap(x -> x.stream()).collect(Collectors.toSet()));
	}
	 
}