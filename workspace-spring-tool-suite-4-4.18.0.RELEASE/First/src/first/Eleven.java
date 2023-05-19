package first;
import java.util.*;//odd even


public class Eleven {
 public static void main(String [] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter no to check whether odd or even");
	 int no=sc.nextInt();
	 if(no%2==0) {
		 System.out.println("no is even");
	 }
	 else {
		 System.out.println("no is odd");
	 }
	 
	 
	 
	 sc.close();
 }
}
