package com.java.strings;

public class StringBuilderExample {

	public static void main(String[] args) {

		//adding values in StringBuilder
	    StringBuilder sb = new StringBuilder("The ");
	    sb.append( "Java " );
	    sb.append( "Tutorial " );
	    System.out.println(sb);
	    //output: The Java Tutorial
	    
	    //insert the specified string with this string at the specified position
	    sb.insert(8," StringBuilder ");
	    System.out.println(sb);
	    //output: The Java StringBuilder  Tutorial
	    
	    //replace the string from specified startIndex and endIndex
	    sb.replace(4,4,"Good");
	    System.out.println(sb);
	    //output: The GoodJava StringBuilder  Tutorial
	    
	    //delete the string from specified startIndex and endIndex
	    sb.delete(0,4);
	    System.out.println(sb);
	    //output: GoodJava StringBuilder  Tutorial
	    
	    //reverse the string
	    sb.reverse();
	    System.out.println(sb);
	    //output: lairotuT  redliuBgnirtS avaJdooG
	    
	    //return the current capacity
	    StringBuilder nsb = new StringBuilder();
	    System.out.println(nsb.capacity());
	    //output: 16 , the default capacity 16
	    
	    nsb.append("The Java Tutorial ");
	    System.out.println(nsb.capacity());
	    //output: 34 , (oldcapacity*2)+2  , (16*2)+2
	}

}
