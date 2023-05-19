package first;
import java.util.*;//perfect no.
public class Eightyfour {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	if(sum==n) {
		System.out.println("No is perfect no.");
	}
	else {
		System.out.println("No is not perfect no.");
	}
	sc.close();
}
}
