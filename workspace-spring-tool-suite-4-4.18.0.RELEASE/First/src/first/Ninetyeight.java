package first;
//Further short cut to lambda exp===>Method references--->to call a method 
//can all lambda expressions be concised into method ref===>NO But converse is true

//In Java 8 we can use the method as if they were objects or primitive values, 
//and we can treat them as a variable. The example shows the function as a variable in java:

//This square function is a variable getSquare. 
//Function<Integer, Integer> getSquare = i -> i * i; 
//SomeFunction(a, b, getSquare); 
//Pass function as a argument to other function easily 


//Sometimes, a lambda expression only calls an existing method. In those cases,
//it looks clear to refer to the existing method by name. The method references
//can do this, they are compact, easy-to-read as compared to lambda expressions.
//A method reference is the shorthand syntax for a lambda expression that 
//contains just one method call. Here’s the general syntax of a 
//
//Generic syntax: Method reference
//To refer to a method in an object 
//
//Object :: methodName 

//Example
//To print all elements in a list
//
//Following is an illustration of a lambda expression that just calls a single method in its entire execution: 
//
//list.forEach(s -> System.out.println(s)); 

//Shorthand to print all elements in a list 
//
//To make the code clear and compact, In the above example, one can turn lambda expression into a method reference:
//
//list.forEach(System.out::println); 

//The method references can only be used to replace a single method of the lambda expression.
//A code is more clear and short if one uses a lambda expression rather than using an anonymous 
//class and one can use method reference rather than using a single function lambda expression to
//achieve the same. In general, one doesn’t have to pass arguments to method references.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Studens{
	int id;
	String str;
	public Studens(int id, String str) {
		this.id = id;
		this.str = str;
	}
	@Override
	public String toString() {
		return "Studens [id=" + id + ", str=" + str + "]";
	}
	
	
}
public class Ninetyeight {
public static void main(String [] args) {
	List<Studens> l=new ArrayList<>();
	int a=0;
	l.add(new Studens(1,"roshan"));
	l.add(new Studens(5,"rohan"));
	l.add(new Studens(2,"rohit"));
	l.add(new Studens(4,"roshani"));
	System.out.println(l);
	Map<Integer,Studens> m=new HashMap<>();
	for(Studens s:l) {
		a++;
		m.put(a,s);
	}
	
	
	l.forEach(s->System.out.println(s));
	l.forEach(System.out::println);//method references;
	//display all Studensts (list) using declarative (fun) style
//	l.forEach(s->System.out.print(s+" "));
	//above line cannot use method references as s and s+" " are not matching arguments
	
	
	System.out.println();
	
	//display all Studenst details(Map)
//	m.forEach((k,v)->System.out.print(v+" "));
	
}
}

//Type 1: Reference to a static method
//If a Lambda expression is like:
//
//// If a lambda expression just call a static method of a class 
//(args) -> Class.staticMethod(args)  
//
//Then method reference is like:
//
//// Shorthand if a lambda expression just call a static method of a class 
//Class::staticMethod  

//import java.io.*;
//import java.util.*;
// 
//// Class 1
//// Helper class
//// Object need to be sorted
//class Person {
// 
//    private String name;
//    private Integer age;
// 
//    // Constructor
//    public Person(String name, int age)
//    {
//        // This keyword refers to current instance itself
//        this.name = name;
//        this.age = age;
//    }
// 
//    // Getter-setters
//    public Integer getAge() { return age; }
//    public String getName() { return name; }
//}
// 
//// Class 2
//// Main class
//public class GFG {
// 
//    // Method 1
//    // Static method to compare with name
//    public static int compareByName(Person a, Person b)
//    {
//        return a.getName().compareTo(b.getName());
//    }
// 
//    // Method 2
//    // Static method to compare with age
//    public static int compareByAge(Person a, Person b)
//    {
//        return a.getAge().compareTo(b.getAge());
//    }
// 
//    // Method 3
//    // Main driver method
//    public static void main(String[] args)
//    {
// 
//        // Creating an empty ArrayList of user-defined type
//        // List of person
//        List<Person> personList = new ArrayList<>();
// 
//        // Adding elements to above List
//        // using add() method
//        personList.add(new Person("vicky", 24));
//        personList.add(new Person("poonam", 25));
//        personList.add(new Person("sachin", 19));
// 
//        // Using static method reference to
//        // sort array by name
//        Collections.sort(personList, GFG::compareByName);
// 
//        // Display message only
//        System.out.println("Sort by name :");
// 
//       
// 
//        // Now using static method reference
//        // to sort array by age
//        Collections.sort(personList, GFG::compareByAge);
// 
//        // Display message only
//        System.out.println("Sort by age :");
// 
//    }
//}
//
//Type 2: Reference to an instance method of a particular object
//If a Lambda expression is like:
//
//// If a lambda expression just call a default method of an object 
//
//(args) -> obj.instanceMethod(args) 
//
//Then method reference is like:
//
//// Shorthand if a lambda expression just call a default method of an object 
//
//obj::instanceMethod 


//import java.io.*;
//import java.util.*;
// 
//// Class 1
//// Helper class
//// Object need to be sorted
//class Person {
// 
//    // Attributes of a person
//    private String name;
//    private Integer age;
// 
//    // Constructor
//    public Person(String name, int age)
//    {
//        // This keyword refers to current object itself
//        this.name = name;
//        this.age = age;
//    }
// 
//    // Getter-setter methods
//    public Integer getAge() { return age; }
//    public String getName() { return name; }
//}
// 
//// Class 2
//// Helper class
//// Comparator class
//class ComparisonProvider {
// 
//    // Method 1
//    // To compare with name
//    public int compareByName(Person a, Person b)
//    {
//        return a.getName().compareTo(b.getName());
//    }
// 
//    // Method 2
//    // To compare with age
//    public int compareByAge(Person a, Person b)
//    {
//        return a.getAge().compareTo(b.getAge());
//    }
//}
// 
//// Class 3
//// Main class
//public class GFG {
// 
//    // Main driver method
//    public static void main(String[] args)
//    {
//        // Creating an empty ArrayList of user-defined type
//        // List of person
//        List<Person> personList = new ArrayList<>();
// 
//        // Adding elements to above object
//        // using add() method
//        personList.add(new Person("vicky", 24));
//        personList.add(new Person("poonam", 25));
//        personList.add(new Person("sachin", 19));
// 
//        // A comparator class with multiple
//        // comparator methods
//        ComparisonProvider comparator
//            = new ComparisonProvider();
// 
//        // Now using instance method reference
//        // to sort array by name
//        Collections.sort(personList,
//                         comparator::compareByName);
// 
//        // Display message only
//        System.out.println("Sort by name :");
// 
//        
// 
//        // Using instance method reference
//        // to sort array by age
//        Collections.sort(personList,
//                         comparator::compareByAge);
// 
//        // Display message only
//        System.out.println("Sort by age :");
// 
//    }
//}

//Type 3: Reference to an instance method of an arbitrary object of a particular type
//If a Lambda expression is like:
//
//// If a lambda expression just call an instance method of a  ObjectType 
//
//(obj, args) -> obj.instanceMethod(args) 
//
//Then method reference is like:
//
//// Shorthand if a lambda expression just call an instance method of a ObjectType 
//
//ObjectType::instanceMethod 

//import java.io.*;
//import java.util.*;
// 
//// Main class
//public class GFG {
// 
//    // Main driver method
//    public static void main(String[] args)
//    {
//        // Creating an empty ArrayList of user defined type
//        // List of person
//        List<String> personList = new ArrayList<>();
// 
//        // Adding elements to above object of List
//        // using add() method
//        personList.add("vicky");
//        personList.add("poonam");
//        personList.add("sachin");
// 
//        // Method reference to String type
//        Collections.sort(personList,
//                         String::compareToIgnoreCase);
// 
//        // Printing the elements(names) on console
//        personList.forEach(System.out::println);
//    }
//}

//Type 4: Constructor method reference
//If a Lambda expression is like: 
//
//// If a lambda expression just create an object 
//(args) -> new ClassName(args) 
//
//Then method reference is like: 
//
//// Shorthand if a lambda expression just create an object 
//ClassName::new 

//import java.io.*;
//import java.nio.charset.Charset;
//import java.util.*;
//import java.util.function.*;
// 
//// Object need to be sorted
//class Person {
//    private String name;
//    private Integer age;
// 
//    // Constructor
//    public Person()
//    {
//        Random ran = new Random();
// 
//        // Assigning a random value
//        // to name
//        this.name
//            = ran
//                  .ints(97, 122 + 1)
//                  .limit(7)
//                  .collect(StringBuilder::new,
//                           StringBuilder::appendCodePoint,
//                           StringBuilder::append)
//                  .toString();
//    }
// 
//    public Integer getAge()
//    {
//        return age;
//    }
//    public String getName()
//    {
//        return name;
//    }
//}
// 
//public class GFG {
// 
//    // Get List of objects of given
//    // length and Supplier
//    public static <T> List<T>
//    getObjectList(int length,
//                  Supplier<T> objectSupply)
//    {
//        List<T> list = new ArrayList<>();
// 
//        for (int i = 0; i < length; i++)
//            list.add(objectSupply.get());
//        return list;
//    }
// 
//    public static void main(String[] args)
//    {
// 
//        // Get 10 person by supplying
//        // person supplier, Supplier is
//        // created by person constructor
//        // reference
//        List<Person> personList
//            = getObjectList(5, Person::new);
// 
//        // Print names of personList
//        personList.stream()
//            .map(x -> x.getName())
//            .forEach(System.out::println);
//    }
//}
