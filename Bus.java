package com.basic;

public class Bus implements Vehicle,Engine{

	public static void main(String[] args) {
		Vehicle b=new Bus();
		b.print();
		

	}

	@Override
	public void print() {
		System.out.println("this is print method");
		
	}

}
