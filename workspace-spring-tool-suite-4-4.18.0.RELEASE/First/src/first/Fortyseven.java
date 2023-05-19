package first;//abstract class 

//Below example of abstract class
//abstract class Aa{
//	abstract void show();
//}
//class Bb extends Aa{
//	void show(){
//		System.out.println("Hey Roshan....!");
//	}
//}
//public class Fortyseven {
//	public static void main(String [] args) {
//		
//	
//	Aa a=new Bb();
//	a.show();
//}
//}
//An abstract class can have a data member, abstract method, method body 
//(non-abstract method), constructor, and even main() method.
abstract class Any{
	int a;
	Any(){
		a=5;
		System.out.println("Haa ji");
	}
	abstract void show();
	void display() {
		System.out.println("Hello ji");
	}
	
}
class Bny extends Any{
	Bny(){
		super();
		System.out.println("Naa ji");
	}
	void show() {
		System.out.println("Kya kr rhe ho");
	}
}

public class Fortyseven{
	public static void main(String [] args) {
	Any a=new Bny();
	a.show();
	System.out.println(a.a);
	a.display();
	
	
		
		
	}
}