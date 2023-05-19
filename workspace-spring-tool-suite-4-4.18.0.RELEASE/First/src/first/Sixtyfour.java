package first;
//Generics in java
//What does type-safe mean Java?
//Image result for what is type safety in java
//TypeSafe means that variables are statically checked for appropriate assignment at compile time. 
//For example, consder a string or an integer. These two different data types
//cannot be cross-assigned (ie, you can't assign an integer to a string nor can you assign 
//a string to an integer).

//Generics means parameterized types. The idea is to allow type (Integer, String, … etc.,
//and user-defined types) to be a parameter to methods, classes, and interfaces. 
//Using Generics, it is possible to create classes that work with different data types. 
//An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
//In Parameter type we can not use primitives like ‘int’,’char’ or ‘double’.
//But we can use arrays as arfays are ref .
//we can write generic function


//class Type<T>{
//	T obj;
//	Type(T obj){
//		this.obj=obj;
//	}
//	void display() {
//		System.out.println(this.obj);
//	}
//}
//
//public class Sixtyfour {
//		
//public static void main(String [] args) {
//	Type<String> t=new Type<String>("Roshan");
//	t.display();
//}
//}

//We can also pass multiple Type parameters in Generic classes. 
class Type<T,U>{
	T obj1;
	U obj2;
	Type(T obj1,U obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	void display() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
public class Sixtyfour {
	public static void main(String [] args) {
		Type<String,Integer> t=new Type<String,Integer>("Roshan",12);
		t.display();
	}
}
