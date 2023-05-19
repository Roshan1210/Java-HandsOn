package first;
import java.util.*;//Normal star pattern

public class Thirteen {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of stars to print ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		
	}

}
