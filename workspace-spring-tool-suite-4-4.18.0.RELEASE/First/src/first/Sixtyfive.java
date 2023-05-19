package first;
import java.util.*;
//Understanding Type safety
//Generics make errors to appear compile time than at run time 
//(It’s always better to know problems in your code at compile 
//time rather than making your code fail at run time). 
//Suppose you want to create an ArrayList that store name of students, 
//and if by mistake the programmer adds an integer object instead of a string, 
//the compiler allows it. But, when we retrieve this data from ArrayList, 
//it causes problems at runtime.

public class Sixtyfive {
public static void main(String [] args) {
	ArrayList  l =new ArrayList();
	l.add("Roshan");
	l.add("Ritika");
	l.add(23);//compiler allows this 
	System.out.println("successfully compiled");
	
}
}



//public class Sixtyfive {
//public static void main(String [] args) {
//	ArrayList<String>  l =new ArrayList<String>();
//	l.add("Roshan");
//	l.add("Ritika");
//	l.add(23);//compiler dont allows this now after using generics
//	
//}

