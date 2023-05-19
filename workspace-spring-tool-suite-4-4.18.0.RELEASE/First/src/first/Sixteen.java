package first;
import java.util.*;//continue
public class Sixteen {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		int i=0;
		while(i<n) {
			
			if(i>5)	
				continue;
		
			
			System.out.println(i);
			i++;
		}
		
		
		
		
		sc.close();
	}

}
