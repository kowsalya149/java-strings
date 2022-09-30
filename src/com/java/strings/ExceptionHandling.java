package com.java.strings;

public class ExceptionHandling {

	public static void main(String[] args) {

		String str="abc";
	    try{
	        System.out.println(str.substring(4));
	    }catch(StringIndexOutOfBoundsException e){
	        System.out.println("StringIndexOutOfBoundsException occured!!");
	        //handling exception here
	    }
	}

}
