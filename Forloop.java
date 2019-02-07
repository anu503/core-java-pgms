package com.basic;
import java.lang.*;

public class Forloop {

	public static void fact(int num){
		int y; int fact=1;
		
		for(y=1;num>=y;y++)
			{ 
			fact=fact*y;	
		}
		
		 	
			System.out.println("the factorial of " + num + " = " + fact);
		}
			
	
	
	public static void main(String[] args) {
		//factorial 5!=5*4*3*2*1
		
		
		fact(5);
		
	}
}
	
		
		
		
		
		
		


	