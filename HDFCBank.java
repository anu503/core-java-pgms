package com.basic;

public class HDFCBank extends Bank {

	@Override
	public void loan() {
		System.out.println("loan method");
		
	}
	public void interest()
	{
		System.out.println("interest method");
	}
	public static void main(String[] args)
	{
		HDFCBank hdfc=new HDFCBank();
		 hdfc.credit();
		 hdfc.debit();
		 hdfc.loan();
		 hdfc.interest();
		 Bank b=new HDFCBank();
		 b.loan();
		 b.credit();
		 b.debit();
		
	}
	}
	


