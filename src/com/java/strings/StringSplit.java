package com.java.strings;

public class StringSplit {

	public static void main(String[] args) {

		String str = "007-034456-0076";

		String[] parts1 = str.split("-");
		for (String x : parts1)
			System.out.println(x);

		System.out.println();
		String[] parts2 = str.split("-", 2);
		for (String x : parts2)
			System.out.println(x);

		System.out.println();
		String s = "(a+b)-c/d";
		String[] parts = s.split("[()+-/]+");
		for (String x : parts)
			System.out.println(x);

		System.out.println("split a String by space");
		String str1 = "Java String Tutorial";
		String[] part = str1.split("\\s+");
		for (String x : part)
			System.out.println(x);
	}
}