package first;
import java.util.*;//hcf and lcm 
public class Eightyfive {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter smaller and larger no to find HCF");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int k=0;
	for(int i=n2-1;i>1;i--) {
		
		if(n2%i==0 &&n1%i==0) {
			k=i;

			System.out.println("HCF of "+n2+" and "+n1+" is "+k);
			System.exit(0);
		}
	}
	
	sc.close();
	
	}

}
