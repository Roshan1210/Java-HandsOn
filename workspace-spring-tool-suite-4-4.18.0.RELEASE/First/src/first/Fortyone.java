package first;//tostring
import java.util.*;
public class Fortyone {
	String name;
	String city;
	int age;
	Fortyone(String name,String city,int age){
		this.name=name;
		this.city=city;
		this.age=age;
	}
	@Override
	public String toString() {
		return "name=> "+this.name+", city=> "+this.city+ ", age=> "+this.age+" ";
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name,city,age");
	Fortyone f=new Fortyone(sc.next(),sc.next(),sc.nextInt());
	System.out.println(f);
	sc.close();
}
}
