package first;
import java.util.*;//lcm 
public class Eightysix{
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter smaller and larger no to find LCM ");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int k=0;
	for(int i=n2;i<=n1*n2;i++) {
		if(i%n1==0 && i%n2==0) {
			k=i;
			System.out.println("LCM of "+n1+" and "+n2+" is "+k);
			System.exit(0);
		}
	}
	
	sc.close();
	
	}

}

