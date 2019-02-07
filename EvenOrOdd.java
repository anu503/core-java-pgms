package com.basic;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num=35;
		if(num%2==0)
			System.out.println("the number is even");
		else 
			System.out.println("the number is odd");
		System.out.println("****************");
		int a[]={10,26,15,45,23};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println("the even number is:" +a[i]);
			else 
				System.out.println("the odd number is:" +a[i]);
		}
		

	}

}
