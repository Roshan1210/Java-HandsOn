package first;
import java.util.*;

public class Thirtyone {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an int value");
		int a=sc.nextInt();
		System.out.println("int value is "+a);
		long b=a;//auto conversion (widening)
		System.out.println("long value is "+b);
		float c=b;//long to float is a potential loss of precision but not magnitude 
//		because the value range for floats is larger than that for longs. 
//		So the rule is: Loss of magnitude: explicit cast required; Loss of precision: no cast required.
		System.out.println("float value is "+c);
		short a1=4;
		byte b1=8;
		System.out.printf("%d",a1+b1);
		
		
		sc.close();
	}
}
