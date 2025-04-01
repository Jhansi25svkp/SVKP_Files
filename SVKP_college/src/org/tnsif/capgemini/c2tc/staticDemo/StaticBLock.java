package org.tnsif.capgemini.c2tc.staticDemo;

public class StaticBLock {

	public void display()
	{
		System.out.println("instance block -1");
	}
	static
	{
		System.out.println("static block -1");
	}
	
	static
	{
		System.out.println("static block -2");
	}
	
	
	public static void main(String[] args) {
		StaticBLock obj=new StaticBLock ();
		obj.display();

	}

}
