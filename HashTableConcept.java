package com.basic;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
	  //it contains only unique values
	//no null key and no null values
	//hashtable is synchronous and it is thread safe
	//key...object ..hashcode..value

	public static void main(String[] args) {
		Hashtable<Integer, String> t=new Hashtable<Integer,String>();
		 t.put(1, "anu");
		 t.put(2, "automation");
		 t.put(3,"engineer");
		// t.put(null, "anu1"); //u r trying to add null it will give null pointer exception
		 System.out.println(t);
		 
		 //clone or shallow...duplicate object
		 
		 Hashtable t1=new Hashtable();
		   t1=(Hashtable) t.clone();
		 
System.out.println(t1);
t.clear();
System.out.println(t);
	
	
	   Hashtable t3=new Hashtable();
	      t3.put(1, "anu");
		 t3.put(2, "automation");
		 t3.put(3,"engineer");
		 System.out.println(t3);
		 //containsValue()
		 
		 if(t1.containsValue("anu"))
			 System.out.println("value is found");
		 //print all the values....Enumeration ...elements() method
		 
		Enumeration e=t3.elements();
			 while(e.hasMoreElements())
				 System.out.println(e.nextElement());
			 
			 //print all the values....using entry set...returns set of objects
		Set s = t3.entrySet();
		System.out.println(s);
		System.out.println(t3.get(1));
		System.out.println(t3.hashCode());
	     
	}
}
