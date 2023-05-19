package first;
import java.util.*;//WILD CARDS

//UPPER BOUND WILD CARDS,LOWER BOUND WILD CARDS
public class Seventyeight {
	
	private static double sum(List<? extends Number> list) {
		double sum=0.0;
		for(Number i:list) {
			sum+=i.doubleValue();
		}
		return sum;
	}
public static void main(String [] args) {
	//Emp<------Mgr-------<SalesMgr
	//Emp e=new Mgr();Upcasting
	
	//AL<Emp> l1=new AL<>();
	//AL<Mgr> l2=new AL<>();
	//l1=l2;//javac error
	//Object o=new Mgr();//upcasting
	//AL<Object> l3=new AL<>();
	//l3=l2;//javac error
	//l3=l1;//javac error type mismatch cannot convert from AL of Emp to Al of Mgr.
	//Inheritance is not working in same manner as working  in classes in Generics.
	
	//So solution is to introduce Wild Cards
	//****************WILD CARDS(?)***********************//
	//Used for inheritance in Generics
	//? can be replaced by ANY type
//	The question mark (?) is known as the wildcard in generic programming. It represents an unknown type.
//	The wildcard can be used in a variety of situations such as the type of a parameter, field, or local variable; 
//	sometimes as a return type. Unlike arrays, different instantiations of a generic type are not compatible with each other,
//	not even explicitly. This incompatibility may be softened by the wildcard if ? is used as an actual type parameter
	
	List<Integer> l1=Arrays.asList(4,5,6,7);
	System.out.println("Total sum is "+sum(l1));
	List<Double> l2=Arrays.asList(4.5,5.9,6.1,7.7);
	System.out.println("Total sum is "+sum(l2));
	
	//In the above program, list1 and list2 are objects of the List class. list1 is a collection of Integer
//	and list2 is a collection of Double. Both of them are being passed to method sum which has a wildcard that 
//	extends Number. This means that list being passed can be of any field or subclass of that field. 
//	Here, Integer and Double are subclasses of class Number.
}
}
