package first;
import java.util.*;//fareheit to celcius
public class Six {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Farenheit");
		float tempf=sc.nextFloat();
		float tempc=tempf-273;
		System.out.println("Temperature in Celcius is "+tempc);
		sc.close();
		
		}

}
