package second;
import java.util.*;//check no. is prime or not 
public class Twentyone {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				System.out.println("No is not prime no");
			}
		
		}
		sc.close();
	}
}
