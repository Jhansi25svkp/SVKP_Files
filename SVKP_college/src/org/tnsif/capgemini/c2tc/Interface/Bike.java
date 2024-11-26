package org.tnsif.capgemini.c2tc.Interface;
//another class implements the same interface

public class Bike implements Vechicle {
	private String type;
	
	public Bike(String type)
	{
		this.type=type;
	}

	@Override
	public void Start() {
		System.out.println("Bike " + type +"is srarting");
	
		
	}
	
    @Override
	public void stop() {
	    System.out.println("Bike " +type + "is stopping");
		
	}

	
		

	}


