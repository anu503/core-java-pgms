package com.basic;

public class IntegerSwap {

	public static void main(String[] args) {
		int x=20;
		int y=30;
//		int temp;//using temp variable
//		temp=x;
//		x=y;
//		y=temp;
//		System.out.println("the value of x using temp:" +x);
//		System.out.println("the value of y using temp:" +y);
//		//swap using + operator
//		x=x+y; //x=50
//		y=x-y; //y=20
//		x=x-y; //x=30
//		System.out.println("the value of x after swaping :" +x);
//		System.out.println("the value of y after swaping:" +y);
//		//swap using * operator
//		x=x*y; //600
//		y=x/y; //20
//		x=x/y;//30
//		System.out.println("the value of x after swaping :" +x);
//		System.out.println("the value of y after swaping:" +y);

        //using XOR operator
		x=x^y;  //exclusive OR ,bitwise operator
		y=x^y;  //    1 XOR 1 = 0
	               // 0 XOR 0 = 0
	    	        // 1 XOR 0 = 1
	    	          //    0 XOR 1 = 1
		x=x^y;
		
		System.out.println("the value of x after swaping :" +x);
		System.out.println("the value of y after swaping:" +y);
	}

}
