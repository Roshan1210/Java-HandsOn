package first;
import java.util.*;

public class Five {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a integer value");
		int a=sc.nextInt();
		System.out.println("Enter a float value");
		float b=sc.nextFloat();
		System.out.println("Enter a String value");
		String c=sc.next();
		System.out.println("Enter a Boolean value");
		boolean d=sc.nextBoolean();
		System.out.println("Enter a double value");
		double e=sc.nextDouble();
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" ");
		
		sc.close();
		
	}
}
