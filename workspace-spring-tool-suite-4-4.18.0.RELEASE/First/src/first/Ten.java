package first;
import java.util.*;//find largest of three

public class Ten {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1 ,no2, no3");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println("no1 is greatest");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("no2 is greatest");
		}
		else{
			System.out.println("no3 is greatest");
		}
		
		sc.close();
		
	}

}
