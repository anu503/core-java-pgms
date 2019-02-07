package com.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
          int a[]=new int[4];  //static array..size is fixed
          System.out.println(a.length);
          //ArrayList is a dynamic array
          //it can hold duplicate values
          //synchronized
          //allows random access to fetch the elements bcoz it stores the elements on index basis
          ArrayList ar= new ArrayList();  //ArrayList is a default class in collections
          ar.add(100);
          ar.add(200);
          ar.add(200);
          ar.add(300);
          ar.add(300);
          System.out.println(ar.size());
          System.out.println(ar.get(0));
          System.out.println("**************");
          //to print all the elements from the arraylist
          //  1)for loop
             // 2) using iterator
          for(int i=0;i<ar.size();i++)
          {
        	  System.out.println(ar.get(i));
        	  
          }
          //  non-generic vs generics....after jdk1.5 java is introduced generics
          //generic means what kind of data is passing to the arraylist.as a tester u know what kind of data u r passing.
          System.out.println("*************");
          ArrayList<Integer> ar1=new ArrayList<Integer>(); //it can acccept only integer values
            ar1.add(100);
            ar1.add(200);
            ar1.add(300);
            System.out.println(ar1.size());
            
            System.out.println("**********************");
            
            ArrayList<String> ar2=new ArrayList<String>();
             ar2.add("anu");
             ar2.add("chitti");
             ar2.add("chintu");
             ar2.add("raj");
             System.out.println(ar2.size());
             for(int j=0;j<ar2.size();j++)
             {
            	 System.out.println(ar2.get(j));
             }
             
             ArrayList<E> ar3=new ArrayList<E>();
             //employee class objects
             Employee e1=new Employee("anu1",35,"automation"); //we can store user defined class objects in arraylist
             Employee e2=new Employee("anu2",35,"manual");
             Employee e3=new Employee("anu3",35,"QTP");
             ArrayList<Employee> ar4=new ArrayList<Employee>();
              ar4.add(e1);
              ar4.add(e2);
              ar4.add(e3);
              //to traverse the elements we use iterator() method
              Iterator<Employee> ie=ar4.iterator();
              while(ie.hasNext())  //we can not use for loop.we are working with objects.
              { 
            	  Employee emp=ie.next();
            	  System.out.print(emp.name);
            	  System.out.print(" ");
            	  System.out.print(emp.age);
            	  System.out.print(" ");
            	  System.out.print(emp.dept);
            	  System.out.println("  ");
              }
              
             }
	}


