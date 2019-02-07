package com.basic;

public class Callbyvalue {
	   int x;	   int y;
	public void swap(int x,int y)
	{
	
		int temp=x;
		x=y;
	y=temp;
	    }

	public static void main(String[] args) {
		Callbyvalue cv=new Callbyvalue();
		cv.x=100;
		cv.y=200;
		
System.out.println("the value of x is before sawp:" + cv.x);
System.out.println("the value of y is before sawp:" + cv.y);
cv.swap(1000,2000);

System.out.println("the value of x is after sawp:" + cv.x);
System.out.println("the value of y is after sawp:" + cv.y);

	}

}
