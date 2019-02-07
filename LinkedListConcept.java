package com.basic;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("anu"); //to add
		ll.add("chintu");
		ll.add("chitti");
		ll.add("raj");
		System.out.println(ll);
		ll.addFirst("Doppalapudi");
		ll.addLast("danda");
		ll.add(0, "first");
		System.out.println(ll);
		System.out.println(ll.size());
		//to retrieve
		
		System.out.println(ll.get(0));
		System.out.println(" using for loop");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
	System.out.println("using advanced for loop");			
      for(String str:ll)
      {
    	  System.out.println(str);
      }
      System.out.println("********using iterator");
      Iterator<String> it=ll.iterator();
         while(it.hasNext()){
        	 System.out.println(it.next());
         }
         System.out.println("*************using while loop");
         int num=0;
         while(ll.size()>num)
         {
        	 System.out.println(ll.get(num));
        	 num++;
         }
         }
      }



