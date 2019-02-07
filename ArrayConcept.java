package com.basic;

public class ArrayConcept {

	public static void main(String[] args) {
		//Array is used to store similar data types.index is starts with "0".ends with "n-1".
		//disadvatages is....size is fixed...static array..to overcome this we use collections...arraylist and hashtable.
		//we can store only similar data types...to overcome this we use object array.
		int a[]=new int[4];  //one dimensional array
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 System.out.println(a[3]);
		// System.out.println(a[4]);// it gives arrayIndexoutofboundsexception...bcoz it has only 4 elements.
		 System.out.println(a.length);   //array length
		 
		 //char array
		 char[] ch=new char[3];
		 ch[0]='a';
		 ch[1]='b';
		 ch[2]='c';
		 System.out.println(ch[1]);
		 System.out.println(ch.length);
		 for(int j=0;j<ch.length;j++)    //prints all the elements in array.for that u need to write for loop.
		 {
			 System.out.println(ch[j]);
		 }

		 //boolean array
		 boolean b[]=new boolean[2];
		 b[0]=true;
		 b[1]=false;
		 System.out.println(b[1]);
		 
		 //object array
		 Object obj[]=new Object[3];  //to define different data types.Object is the super class.
		 obj[0]="Anu";
		 obj[1]=35;
		 obj[2]=23.55;
		 System.out.println(obj[2]);
		 System.out.println(obj.length);
		 for(int k=0;k<obj.length;k++)
			 System.out.println(obj[k]);
	}

}
