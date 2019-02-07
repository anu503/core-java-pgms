package com.basic;

import java.util.Arrays;

public class BigAndSmallNumInArray {

	public static void main(String[] args) {
		int numbers[]={25,40,-99,15,-10,27,-88,65,6789};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
				largest=numbers[i];
			else
				if(numbers[i]<smallest)
					smallest=numbers[i];
			
		}
		
        System.out.println("the elements of the array are:"+Arrays.toString(numbers));
        System.out.println(largest);
        System.out.println(smallest);
	}

}
