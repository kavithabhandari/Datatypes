package JavaPackage;

public class DTDemo {
	public static void main(String[] args) {
		 byte bt=-20;
		 short sht=125;
		 int myint=7634;
		 long lng=76274L;
		
		 float myfloat=2.1f;
		 double mydouble=23.1d;
		 
		 boolean bool= true;
		 char ch='n';
		 
		 DTDemo dtd = new DTDemo();
		 String str = new String();
		 
		 int add=bt+sht;
		 
		 int subtract=myint-sht;
		 
		 long multiply=lng*myint;
		 
		 double divide=myfloat%mydouble;
		 
		 //printing results of arithmetic operations
		 System.out.println("addition (byte + short) = " + add);
		 System.out.println("subtraction (int - short) = " + subtract);
		 System.out.println("multiply (long * int) = " + multiply);
	}

}
