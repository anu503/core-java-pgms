package com.basic;

import java.util.Arrays;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={20,10,40,60,30,90};
		Arrays.sort(a); //sorts in ascending order
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		System.out.println(Arrays.toString(a));
		System.out.println("second biggest number"+a[a.length-2]);
		
		

	}

}
