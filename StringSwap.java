package com.basic;

public class StringSwap {

	public static void main(String[] args) {
		String s1="Anuradha";
		String s2="Doppalapudi";
		System.out.println("the value of string is:"+s1);
		System.out.println("the value of string is:"+s2);
		//append the strings
		s1=s1+s2;
		System.out.println(s1);
		//store the initial string in s2
		s2=s1.substring(0, s1.length()-s2.length());
		//store the string in s1
		s1=s1.substring(s2.length());
		System.out.println("the values after swapping:");
		System.out.println("the value of string is:"+s1);
		System.out.println("the value of string is:"+s2);

	}

}
