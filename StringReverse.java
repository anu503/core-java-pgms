package com.basic;

public class StringReverse {

	public static void main(String[] args) {

String s="hello world";  
String s1="anu";
String rev="";
int len=s1.length();   //in String class there is no reverse() method.this class is immutable.

   System.out.println(len);  //1st way ...creating for loop
   for (int i=len-1;i>=0;i--)
   {
	   rev=rev+s1.charAt(i);
   }
   System.out.println(rev);
   System.out.println("***********************");
   StringBuffer str=new StringBuffer(s); //2nd way...using StringBuffer class
     //str.reverse();     
     System.out.println( str.reverse());// in this class only we have reverse() method.this class is mutable
	}

}
