package com.basic;

public class MissingNumInArray {

	public static void main(String[] args) {
		int num[]={-1,0,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
int sum1=0;
for(int j=-1;j<=10;j++)
{
	sum1=sum1+j;
}
 System.out.println(sum1);
 System.out.println("the missing number is:" +(sum1-sum));
		
	}

}
