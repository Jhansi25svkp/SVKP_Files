package basicsofjava;

public class Bitwise_Operator {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		
		//bitwise AND operator
		 System.out.println("(a&b):"+(a&b));
		 
		 //bitwise OR operator
		 System.out.println("(a|b):"+(a|b));
		 
		 //bitwise XOR operator
		 //The XOR operator(^) compare two bits
		 //The result is1if the bits are dfferent and 0if the bits are same
		 System.out.println("(a^b):"+(a^b));
		 
		 //bitwise NOT operator
		 //invert all bits results depends on system
		 System.out.println("(~a):"+(~a));
	     
		 //Left shift
		 System.out.println("(a<<3):"+(a<<3));
		 
		 //Right shift
		 System.out.println("(a>>2):"+(a>>2));
		 

	}

}
