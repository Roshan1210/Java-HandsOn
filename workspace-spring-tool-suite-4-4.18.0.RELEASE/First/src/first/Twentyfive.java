package first;//power of number
import java.util.*;

public class Twentyfive {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num ");
		int n1=sc.nextInt();
		System.out.println("Enter power to find ");
		int n2=sc.nextInt();
		int num=1;
		int i=1;
		while(i<=n2) {
			num=n1*num;
			i++;
		}
		 
		

		System.out.println("No is "+num);
			
		
		
		
		
		sc.close();
}
}
