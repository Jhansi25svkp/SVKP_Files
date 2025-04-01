
package org.tnsif.capgemini.c2tc.constructor;

class Myclass3
{
	String color;
	int cost;
	String brand;
	
	
	//Parameterized  constructor
	Myclass3(String color, int cost ,String brand)
	{
		this.color=color;
		this.cost=cost;
		this.brand=brand;
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Myclass3 obj=new Myclass3("white",2338372,"BMW");
		Myclass3 obj1=new Myclass3("black",2000000,"Audi");
		System.out.println(obj.color + " "+ obj.cost+ " " +obj.brand);
		System.out.println(obj1.color + " "+ obj1.cost+ " " +obj1.brand);

	}

}