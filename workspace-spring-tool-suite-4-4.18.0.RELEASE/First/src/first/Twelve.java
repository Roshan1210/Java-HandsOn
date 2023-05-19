package first;
import java.util.*;


public class Twelve {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of which factorial you want");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial is "+fact);
		sc.close();
	}

}
