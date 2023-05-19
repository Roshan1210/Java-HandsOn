package first;
//JAVA 8-->Static methods
//The interfaces can have static methods as well which is similar to static method of classes
//Can't be overridden but can be re-declared
interface AX{
	void show();//abstract method
	static void know() {//static method 
		System.out.println("Know");
	}
}
public class Eightyeight implements AX {
	public void show() {
		System.out.println("Show");
	}
	static void know() {//static method redeclared
		System.out.println("Know in class");
	}
	
public static void main(String [] args) {
	Eightyeight e=new Eightyeight();
	e.show();
	AX.know();
	know();
}
}
