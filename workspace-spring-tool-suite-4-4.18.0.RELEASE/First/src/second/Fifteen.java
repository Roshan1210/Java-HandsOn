package second;
import java.util.*;//reverse a no

public class Fifteen {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. to reverse");
		int n=sc.nextInt();
		int num=0;
		int rev=0;
		
		
		while(n!=0) 
		{
			num=n%10;//421
			rev=num +rev*10;
			n=n/10;
			
		}
		
		System.out.println("reverse no. is "+rev);
		sc.close();
	}

}
