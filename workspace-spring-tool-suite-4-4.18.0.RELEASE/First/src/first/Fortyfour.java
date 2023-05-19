package first;//method overloading
import java.util.*;
public class Fortyfour {

static int area(int s) {
	return s*s*s;
}
static int area(int l,int b,int h) {
	return l*b*h;
}
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length for cube area");
	System.out.println(area(sc.nextInt()));
	System.out.println("Enter length,breadth,height for cuboid volume");
	System.out.println(area(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	sc.close();
}
}
