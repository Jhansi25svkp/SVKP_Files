package org.tnsif.capgemini.c2tc.Interface;

public class InterfaceDemo {

	public static void main(String[] args) {
	//we can't instantiate the interface itself
		
		
		
		
		Vechicle Car=new Car("Toyota corolla");
		Vechicle Bike=new Bike("Mountain bike");
		
		
		Car.Start();
		Car.stop();
		
		Bike.Start();
		Bike.stop();
		System.out.println("Maximum speed  for Vehicle" + Vechicle.max_speed);
	}

}
