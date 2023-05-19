package first;//try with resources
import java.util.*;
public class Fiftyfive {
public static void main(String [] args) {
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter A and B");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a/b);
		System.out.println("Done");
		
	}
	catch(ArithmeticException e) {
		System.out.println("Exception occured");
		e.printStackTrace();
	}
}
}
