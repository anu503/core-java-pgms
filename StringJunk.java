package com.basic;

public class StringJunk {

	public static void main(String[] args) {
	String str="@#$%$%%%%%%%%%% Selenium @$#%$%&& Testing";
	
	str=str.replaceAll("[^a-zA-Z0-9]", "");  //to remove unwanted text we use regular expression
	System.out.println(str);

	}

}
