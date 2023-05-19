package first;
import java.util.*;

public class Assignment {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first double value ");
		
		if(sc.hasNextDouble()) {
			
		
			System.out.println("Enter first double value is correct ");
			
		}
		else
			System.out.println("first double value is wrong");
		sc.close();
	}

}
