package com.java.strings;

import java.util.StringJoiner;

public class ReverseWords {

	public static String reverseWords(String s) {
		String[] strarr = s.split("[.]",0);
		StringJoiner joiner = new StringJoiner(".");
		for(int i=(strarr.length)-1; i>=0; i--) {
			joiner.add(strarr[i]);
		}
		String str = joiner.toString();
		return str;
	}
	
	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		
		String res = reverseWords(s);
		
		System.out.println(res);
	}
}
