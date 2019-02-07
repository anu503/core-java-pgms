package com.basic;

public class NumberSwap {

	public static void main(String[] args) {
		int a=40;
		int b=77;
		System.out.println("the value of a is before swap:" +a);
		System.out.println("the value of b is before swap:" +b);
		a=a+b;  //a=55
		b=a-b;//b=25
        a=a-b;//a=30
        System.out.println("the value of a is after swap:" +a);
		System.out.println("the value of b is after swap:" +b);
		
		//xor                             0 0..0, 0 1...1,1 0...1,1 1...0
		a=a^b;
		b=a^b;
		a=a^b;
        
	}

}
