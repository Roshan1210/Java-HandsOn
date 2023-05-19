package first;
import java.util.*;
public class Seventyfive {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no to chk perfect square or not");
	int n=sc.nextInt();
	for(int i=1;i<n/2;i++) {
		if(i*i==n) {
			System.out.println("No is perfect square");
			System.exit(0);
		}
	}
	System.out.println("No is not perfect square");
	sc.close();
}
}
