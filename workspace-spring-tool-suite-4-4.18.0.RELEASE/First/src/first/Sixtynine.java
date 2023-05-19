package first;
import java.util.*;//Natural sorting primary key(ints);

class Vehicle implements Comparable<Vehicle>{
	int chasisNo;
	String color;
	String company;
	public Vehicle(int chasisNo, String color, String company) {
		this.chasisNo = chasisNo;
		this.color = color;
		this.company = company;
	}
	
	public String toString() {
		return chasisNo+" "+color+" "+company+" ";
	}

	public int compareTo(Vehicle another) {
		if(chasisNo<another.chasisNo) {
			return -1;}
		else if (chasisNo==another.chasisNo) {
			return 0;
		}
		else {
			return 1;}
		
		
	}
	
}
public class Sixtynine {
public static void main(String [] args) {
	List<Vehicle> l=new ArrayList<Vehicle>();
	Vehicle v1=new Vehicle(2344,"red","maruti");
	Vehicle v2=new Vehicle(2345,"red","maruti");
	Vehicle v3=new Vehicle(2222,"red","maruti");
	Vehicle v4=new Vehicle(3444,"red","maruti");
	l.add(v1);
	l.add(v2);
	l.add(v3);
	l.add(v4);
	System.out.println(l);//[2344 red maruti , 2345 red maruti , 2222 red maruti , 3444 red maruti ]
	Collections.sort(l);
	System.out.println(l);//[2222 red maruti , 2344 red maruti , 2345 red maruti , 3444 red maruti ]
}
}
