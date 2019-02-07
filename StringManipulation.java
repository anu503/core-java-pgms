package com.basic;

public class StringManipulation {

	public static void main(String[] args) {
		String str="The rains have started here so soon so";
		System.out.println(str.length());
		System.out.println(str.charAt(6));//it starts with 0
		System.out.println(str.indexOf('s')); //1st occurance of 's'.it starts with 0
		System.out.println(str.indexOf('s',str.indexOf('s')+1));//2nd occurance of 's'
		System.out.println(str.indexOf('s',1+str.indexOf('s',str.indexOf('s')+1)));//third occurance of s
		System.out.println(str.indexOf('s',1+str.indexOf('s',1+str.indexOf('s',str.indexOf('s')+1))));//4th occurance of s
		System.out.println(str.indexOf('s',1+str.indexOf('s',1+str.indexOf('s',1+str.indexOf('s',str.indexOf('s')+1)))));//5th
		System.out.println(str.substring(9, 13));
		System.out.println(str.endsWith("soon"));
		String s1="this_is_selenium_training";
		String s3="this_is_selenium";
		String s5="this_is_selenium";
		String s4=s3+"_training";
		System.out.println("*******************");
		System.out.println(s3==s5);
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.trim());
		System.out.println(s1.replace(" ", ""));
		String s2[]=s1.split("_");
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		System.out.println(s1.indexOf("hello"));
		
		
	}

}
