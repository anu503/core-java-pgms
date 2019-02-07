package com.basic;

public class TwoDimArray {

	public static void main(String[] args) {
		String a[][]=new String[2][3];
		//first row
		 a[0][0]="anu";
		 a[0][1]="chetan";
		 a[0][2]="yamini";
		 //second row
		 a[1][0]="anu1";
		 a[1][1]="chetan1";
		 a[1][2]="yamini2";
		 System.out.println(a.length);
		 System.out.println(a[0].length);
		 //print all the elements
		  for(int row=0;row<a.length;row++)
		  {
			  for(int col=0;col<a[0].length;col++)
			  {
				  System.out.print(a[row][col]);
				  System.out.print("  ");
			  }
			System.out.println("  ");
		  }
		  
		 
	}

}
