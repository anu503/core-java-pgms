package com.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapDemo {
	// it implements Map interface and extends Abstract HashMap
	      //it stores values in key and value pair
	      //it contains only unique values
	//it maintains no order
	//it can allow one null key and multiple null values
	//HasMap is non  synchronized means multiple threads can access the hash map with out any problem.so it increased performance
	//if u want to use fast performance application u can use hashmap.it is not thread safe.
	//disadv: concurrent modification exception.....fail..fast condition
  //if any thread modifies the map structure or remove the particular element in hash map object that is called fail..fast.
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String> ();
		 hm.put(1,"Selenium");
		 hm.put(2, "QTP");
		 hm.put(3, "manual");
		 System.out.println(hm.get(1));
		 System.out.println(hm);
		 
		 //traverse the hashmap
		 for(Entry h: hm.entrySet())
		 {
			 System.out.println(h.getKey() +" " +h.getValue());
			// System.out.print(h.getValue());
		 }
		  
		 System.out.println(hm.remove(2));
		System.out.println(hm);
		
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee> ();
		   Employee e1=new Employee("anu",35,"automation");  //employee is a class.like this we can store class objects.
		   Employee e2=new Employee("chintu",7,"student");
		   Employee e3=new Employee("chitti",5,"student");
		   emp.put(1,e1);
		   emp.put(2, e2);
		   emp.put(3, e3);
		   for(Entry<Integer,Employee> h1:emp.entrySet())  //Entry is an interface
		   {
			  int m=h1.getKey();
			  Employee e=h1.getValue();
			  System.out.println(m);
			  System.out.println(e.name + " " +e.age +" " +e.dept);
			  
		   }
		
		
		
		
			}

}
