package first;//print multiplication table
import java.util.*;

public class Nineteen {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println(n+"*"+i+"="+n*i);
	}
	sc.close();
	
}
}
																																																