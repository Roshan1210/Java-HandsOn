package first;
import java.util.*;//Hashset

class Emp{
	int rollno;
	String name;
	int id;
	public Emp(int rollno, String name, int id) {
		this.rollno = rollno;
		this.name = name;
		this.id = id;
	}
	@Override
	public boolean equals(Object o) {
		System.out.println("In employee equals");
		if(o instanceof Emp) {
			return id==((Emp)o).id;
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		System.out.println("in hashcode");
		return 10;
	}
}
public class Eightythree {
public static void main(String [] args) {
	HashSet<Emp> emps=new HashSet<>();
	Emp e1=new Emp(101,"abc",1000);
	Emp e2=new Emp(101,"abc",1000);//Hashset cannot identify duplicates here even after adding overriding equals method.
	Emp e3=new Emp(101,"abc",1000);//as it doesnot call equals method here
	emps.add(e1);
	emps.add(e2);
	emps.add(e3);
	System.out.println(emps);
	//Hashset is a Data structure based on hashing
	//Converting java object into Integer
	//Method which will give address of java object present in the heap 
	//Hashcode()----->object class(converting from obj to int)
	//if we dont override(Hashcode) then it gives you Internal representation of address
	//Contract of hashcode and equals
	//1)unique hashcode for unique objects(consistency)
	//2)same obj)(according to equals method_) should produce same hashcode.
	System.out.println(e1.equals(e2));//true====>as we have overridden equals method for content equality
	System.out.println(e1.equals(e3));//true

	//System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());//2083562754 1239731077 557041912
	//here we get distinct hashcode
	//we are not following the contract so our hashset cannot detect duplicates
	//in order to complete contract override hashcode
	
	
	System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());
	
	}
}



