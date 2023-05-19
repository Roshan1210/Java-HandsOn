package first;
import java.util.*;//swapping two no.s

public class Seven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1 and no2");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=a1;
		a1=a2;
		a2=a3;
		System.out.println("no1 and no2 after swapping are "+ a1+" and "+a2);
		
		
		sc.close();
		
	}

}
