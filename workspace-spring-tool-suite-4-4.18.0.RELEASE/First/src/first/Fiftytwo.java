package first;


//Exception handling in java
//Checked Exceptions: Checked exceptions are called compile-time exceptions because these exceptions are 
//checked at compile-time by the compiler.
//Unchecked Exceptions: The unchecked exceptions are just opposite to the checked exceptions. 
//The compiler will not check these exceptions at compile time. In simple words, 
//if a program throws an unchecked exception, and even if we didn’t handle or declare it,
//the program would not give a compilation error.


public class Fiftytwo {
public static void main(String [] args) {
	
	
	int a =5;
	int b=0;
	try {
	System.out.println(a/b);}
	catch(ArithmeticException  e) {
		System.out.println(e);
		System.out.println("catch");
	}
	finally {
		System.out.println("Good to go");
	}
	
	
}
}
