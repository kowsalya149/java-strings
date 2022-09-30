package com.java.strings;

public class TestClass {

	public static void main(String[] args) {

		//The String indexOf() method is case-sensitive
		String str = "Halo World!";
	    int idx1 = str.lastIndexOf('l');
	    System.out.println("last Index of 'l' is  "+idx1);
	    int idx2 = str.indexOf('l');
	    System.out.println("Index of 'l' is  "+idx2);
	    int idx3 = str.indexOf("World");
	    System.out.println("World is exist and position is "+idx3);
	    int idx4 = str.indexOf("Halo",4);
	    System.out.println("Position of Halo after index 4 is "+idx4);
	    
	    //String replace(char oldChar, char newChar)
	    //String replaceAll(String regex, String replacement)
	    //String replaceFirst(String regex, String replacement)
	    
	  //replacing single char
	    String str1 = "twinkle twinkle little star";
	    System.out.println(str1);
	    String output= str1.replace('t','T');
	    System.out.println(output);
	    //replacing all substring
	    output = str1.replaceAll("twinkle","Hi");
	    System.out.println(output);
	    //replacing first substring
	    output = str1.replaceFirst("twinkle","Hi");
	    System.out.println(output);
	    
	    String str2 = "twinkle 1111 twinkle 2222 little 3333 star";
	    output = str2.replaceAll("[a-zA-Z]+","Hi");
	    System.out.println(output);
	    output = str2.replaceAll("[0-9]+","Hi");
	    System.out.println(output);
	    
	    //contains - case sensitive
	    boolean got = str1.contains("little");
	    System.out.println("String contains 'little' : " + got);
	    got = str1.contains("Little");
	    System.out.println("String contains 'Little' : " + got);
	    got = str1.contains("java");
	    System.out.println("String contains 'java' : " + got);
	    
	    System.out.println("Hashcode is :" + str1.hashCode() );
	    System.out.println();
	    
	    String s1 = "Java";
	    String s2 = "Java";
	    String s3 = "ASP";
	    int val = 0;
	    val = s1.compareTo(s2);
	    System.out.println(val);
	    val = s1.compareTo(s3);
	    System.out.println(val);
	    val = s3.compareTo(s1);
	    System.out.println(val);
	    
	    System.out.println(s1.substring(5));
	}

}