package first;
import java.util.*;
//Natural ordering using comparable interface -->single sorting criteria
//we don’t have to write code to implement the Comparableinterface because the 
//String, Integer and Date classes already implemented this interface. 
//Hence we can sort a collection containing objects of these types.
//Other wrapper types in Java are also comparable: Long, Double, Float, etc.
//When we create our own type, we have to implement the Comparableinterface in order to 
//have objects of our type eligible to be sorted in collections or arrays.

class Employee implements Comparable<Employee>{
	String firstname;
	String lastname;
	Employee(String firstname,String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public String toString() {
		return firstname+" "+lastname;
	}
//	First, we compare the first name by using the String’s compareTo() method. 
//	We can safely use this method of the built-in types in Java: String, Date, Integer, Long, etc.  
//	If two employees have same first name (compare value = 0), then we compare their 
//	last name. Finally the compare value is returned as per the contract of the Comparable interface.
	public int compareTo(Employee another) {
		int compareValue=this.firstname.compareTo(another.firstname);//ascending order
		if(compareValue==0) {//public int compareTo(Employee another) {
                             // return another.firstName.compareTo(this.firstName);}//descending order
		
			return this.lastname.compareTo(another.lastname);
		}
		return compareValue;
	}
}
public class Sixtyeight {
public static void main(String [] args) {
	List<Employee> l=new ArrayList<Employee>();
	Employee e1=new Employee("Roshan","Sharma");
	Employee e2=new Employee("Rohit","Verma");
	Employee e3=new Employee("Rohan","Jangid");
	Employee e4=new Employee("Raashi","Patil");
	l.add(e1);
	l.add(e2);
	l.add(e3);
	l.add(e4);
	System.out.println(l);//[Roshan Sharma, Rohit Verma, Rohan Jangid, Raashi Patil]
	Collections.sort(l);
	System.out.println(l);//[Raashi Patil, Rohan Jangid, Rohit Verma, Roshan Sharma]
	
	
	
	
	
}
}
