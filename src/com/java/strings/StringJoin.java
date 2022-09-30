package com.java.strings;

public class StringJoin {

	public static void main(String[] args) {

		String str1 = "Java ";
	    String str2 = "String ";
	    String str3 = "Tutorial";
	    String result = str1 + str2 + str3;
	    System.out.println("string join using + operator");
	    System.out.println(result);
	    
	    System.out.println();
	    String longStr = "Java";
	    StringBuffer tmpSb = new StringBuffer(longStr);
	    tmpSb.append("Tutorial");
	    longStr = tmpSb.toString();
	    System.out.println("string join using stringbuffer");
	    System.out.println(longStr);
	    
	    String str = new StringBuffer().append("first").append("second").append("third").toString();
	    System.out.println(str);
	    
	    System.out.println();
	    String first = "Java";
	    String second = "Tutorial";
	    String s = first.concat(second);
	    System.out.println("string join using concat");
	    System.out.println(s);
	}

}
