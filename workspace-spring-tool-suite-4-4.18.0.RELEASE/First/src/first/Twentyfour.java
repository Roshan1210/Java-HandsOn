package first;//leap year or not 

import java.util.Scanner;

public class Twentyfour {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year to check");
		int n=sc.nextInt();
		
		if(n%400==0) {
			System.out.println("year is leap year");
		}
		
		else if(n%4==0 && n%100!=0) {
			System.out.println("year is leap year");
		}
		else {
			System.out.println("year is not leap year");
		}
		
		sc.close();

}
}
