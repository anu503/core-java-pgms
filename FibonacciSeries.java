package com.basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		
		System.out.print("0 1 ");
		while(k<=n)
		{
			 k=a+b;
             a=b;   //a=1
             b=k;   //b=2
              //k=2
		
             System.out.print(k + " ");
		}

}
}