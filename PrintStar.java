package com.basic;

public class PrintStar {

	public static void main(String[] args) { 
		
		for(int i=0;i<5;i++)  //outerloop will print rows
		{
			for(int j=0;j<=i;j++)  //innerloop will print columns
			
				{
				  System.out.print("*");
			   }
		
			System.out.println("");
		    }
		}
}


