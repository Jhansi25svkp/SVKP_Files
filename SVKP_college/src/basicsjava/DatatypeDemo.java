package basicsjava;

public class DatatypeDemo {

	public static void main(String[] args) {
		//byte-1 byte
		byte byteMax=127;
		byte byteMin=-128;
		System.out.println("Min range of byte is"  +byteMin  +"Max range of byte" + byteMax);
		
		
		//short - 2 bytes
		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("Min range of short is" +shortMin +"Max range of short" + shortMax);
		
		//int - 4bytes
		int MaxInt = 2147483647;
		int MinInt = -2147483648;
		System.out.println("Min range of int is"+MinInt +"Max range of int" + MaxInt);
		
		//long - 8bytes
		long MaxLong = 9223372036854775807L;
		long MinLong = -9223372036854775808L;
		System.out.println("Min range of Long is" +MinLong + "Max range of Long" +MaxLong);
		
		//boolean
		boolean status=false;
		System.out.println("boolean value is" +status);
		
		//char
		char c= 'M';
		System.out.println("char value" +c);
		
		
		
		

	}

}
