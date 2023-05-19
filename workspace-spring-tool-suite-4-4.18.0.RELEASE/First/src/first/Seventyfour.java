package first;
import java.util.*;
public class Seventyfour {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no to find factor of ");
	int n=sc.nextInt();
	System.out.print("Factors of "+n+" are ");
	int k=0;
	for(int i=2;i<=n/2;i++) {
	if(n%i==0) {
		System.out.print(i+", ");
		k++;
	}
	}
	System.out.println("There are "+k+" factors of "+n);
	sc.close();
}
}
