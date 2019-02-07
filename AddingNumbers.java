package com.basic;

public class AddingNumbers {

	public static void main(String[] args) {
		int num=4523123;
		int sum=0;
	//int	rem=0;
		while(num!=0)
		{
		
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println(sum);

	}

}
