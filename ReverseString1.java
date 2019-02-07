package com.basic;

public class ReverseString1 {

	public static void main(String[] args) {
	   String str="this is Selenium";
	   int len=str.length();
	   String rev="";
	   for(int i=len-1;i>=0;i--)
	   {
		   rev=rev+str.charAt(i);
	   }
        System.out.println(rev);

	
	String str1="this is Selenium";
	StringBuffer s1=new StringBuffer(str1);
	System.out.println(s1.reverse());
	}
}
