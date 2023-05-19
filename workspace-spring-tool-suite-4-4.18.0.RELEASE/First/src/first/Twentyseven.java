package first;
import java.util.*;//sum of digits
public class Twentyseven {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no and no of digits of that no");
		int num=sc.nextInt();
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		int r=0;
		while(i<=n) {
			r=num%10;
			sum=sum+r;
			num=num/10;
			i++;
		}
		System.out.println("Sum is "+sum);
		
		sc.close();
}
}
