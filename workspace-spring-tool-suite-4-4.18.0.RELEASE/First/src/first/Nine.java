package first;
import java.util.*;//addition of two numbers

public class Nine {
	
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1 and no2");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		Nine n=new Nine();
	System.out.println("sum is "+n.add(a1,a2));
		
		
		sc.close();
		
		
	}

}
