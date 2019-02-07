package com.basic;

public class WorkingwithStrings {

	public static void main(String[] args) {
		
		String s1="hi all......!";
		String s2="this is Anu";
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.charAt(1));	
		System.out.println(s2.length());
		System.out.println(s1 + s2);
System.out.println(s1.concat(s2));
System.out.println(s1.startsWith("h"));
System.out.println(s1.endsWith("all"));
System.out.println(s1.contains("all..."));
	}

}
