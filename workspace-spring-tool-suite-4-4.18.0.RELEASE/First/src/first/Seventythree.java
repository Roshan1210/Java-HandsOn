package first;
import java.util.*;//fibonacci series
public class Seventythree {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int first=0;
	int second=1;
	int i=1;
	System.out.println("Enter no of termas to print in fibonacci series");
	int n=sc.nextInt();
	int next=0;
	System.out.print(first+" "+second+" ");
	while(i<=n-2) {
		next=first+second;
		first=second;
		second=next;
		System.out.print(next+" ");
		i++;
	}
	sc.close();
}
}
