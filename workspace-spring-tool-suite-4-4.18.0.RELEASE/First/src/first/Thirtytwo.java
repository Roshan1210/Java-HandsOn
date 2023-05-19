package first;
import java.util.*;//Scanner
public class Thirtytwo {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();//default delimiter is white space
		System.out.println("Enter String");
		String str=sc.nextLine();//no delimiter reads whole line
		System.out.println(num+" "+str);
		
		sc.close();
		
	}
}
