package first;
import java.util.*;//Arrays
public class Thirtfour {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		double[] data;
		System.out.println("Enter array length");
		data=new double [sc.nextInt()];
		for(int i=0;i<data.length;i++) {//for loop
			System.out.println(data[i]);
		}
		System.out.println();
		for(double d:data) {//for each loop
			
		System.out.println(d);}
		
		//lets try to modify
		System.out.println();
		for(int i=0;i<data.length;i++) {//for loop
			data[i]=1+data[i];
			System.out.println(data[i]);
		}
		System.out.println();
		for(double d:data) {//for each loop
			
			System.out.println(2*d);}
		System.out.println();
		for(double d:data) {//for each loop
			
			System.out.println(d);}
		
		
		sc.close();
	}
}
