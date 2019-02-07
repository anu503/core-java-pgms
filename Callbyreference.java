package com.basic;

public class Callbyreference {
	
	 int x;
	   int y;
	public void swap(Callbyreference cv)
	{
	
		int temp=cv.x;
		cv.x=cv.y;
	cv.y=temp;
	    }

	public static void main(String[] args)
	{
		Callbyreference cv=new Callbyreference();
		cv.x=25;
		cv.y=35;
		
		System.out.println("the value of x is before sawp:" + cv.x);
		System.out.println("the value of y is before sawp:" + cv.y);
		cv.swap(cv);

		System.out.println("the value of x is after sawp:" + cv.x);
		System.out.println("the value of y is after sawp:" + cv.y);
		cv.swap(cv);
		System.out.println("the value of x is after sawp:" + cv.x);
		System.out.println("the value of y is after sawp:" + cv.y);

			}
		

	}


