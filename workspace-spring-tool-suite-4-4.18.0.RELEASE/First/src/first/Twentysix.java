package first;//prime no. within given range
import java.util.*;
public class Twentysix {
	public static int prime(int num) {
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
			
				return 0;//not prime
			}
		}
		
		return 1;
		
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit and upper limit range to check primes ");
		int l=sc.nextInt();
		int u=sc.nextInt();
		int j=2;
		for(int i=l;i<=u;i++) {
			j=prime(i);
			if(j==1) {
			System.out.println(i +" is prime");
			}
			
			if(j==0) {
				System.out.println(i +" is not prime");
			}
			j=2;
		}
			
		
		
		
		sc.close();
		
				
		
	}

}
