package org.tnsif.capgemini.c2tc.Interface;

public class Car implements Vechicle {
	private String model;
	
	//constructor
	public Car(String  model)
	{
		this.model=model;
	}
	

	@Override
	public void Start() {
		System.out.println("Car " + model +" is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Car " + model +" is stopped");
		
	}

		

	}


