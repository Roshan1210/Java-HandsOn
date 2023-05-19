package first;//string to integer
import java.util.*;


public class Twentyeight {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numeric string");
		String str=sc.next();
		int num=Integer.parseInt(str);
	   
		System.out.println("number is "+num);
		sc.close();
	}

}
