package first;//check no is negative or positive or zero
import java.util.*;

public class Twentytwo {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("no is positive");
		}
		else if(n<0) {
			System.out.println("no is negative");
		}
		else {
			System.out.println("no is zero");
		}
		sc.close();
	}

}
