package com.basic;

public class Honda implements Car {

	
	public void start() {
		System.out.println("Honda....start");
	}

	
	public void stop() {
		System.out.println("Honda....stop");
		
	}


	public void refuel() {
		System.out.println("honda...refuel");
		
	}
	public void wheels()
	{
		System.out.println("honda...whreels");
	}
	
	public static void main(String[] args) {
  Honda h=new Honda();
  h.start();
  h.stop();
  h.refuel();
  h.wheels();
  
  Car c=new Honda();
  c.start();
  c.stop();
  c.refuel();
  
}
}
