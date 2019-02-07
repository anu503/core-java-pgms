package com.basic;

public class Employee {
	String name;  //global variables
	int age;
	String dept;
	Employee(String name,int age,String dept)  //local variables
	{
		this.name=name;  //to initialize global variables with local variables we use 'this' keyword
		this.age=age;  //this.age is global variable
		this.dept=dept;
	}

}
