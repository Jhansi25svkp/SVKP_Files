package basicsofjava;

public class Variable {
	int num=1000; //instance variable
	void print()
	{
		
		String name="arvind"; //local variable
		System.out.println(name);
	}	
	static String message="Good morning.....!";  //static variable
	public static void main(String[] args) {
	  Variable obj=new Variable();
	  System.out.println(obj.num);
      obj.print();
	  System.out.println(message);
	}
}
