package com.java.strings;

public class Palindrome {

	public static void main(String[] args) {

		String str = "REVER";
		if (checkPal(str))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
	}

	public static boolean checkPal(String pStr) {
		if((pStr.length() == 0) || (pStr.length() == 1))
			return true;
		else if(!pStr.substring(0, 1).equals(pStr.substring(pStr.length() - 1)))
			return false;
		else
			return checkPal(pStr.substring(1, pStr.length() - 1));
	}

}
