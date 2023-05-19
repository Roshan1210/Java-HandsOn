package first;//static methods from jdk 8 for interfaces
//static methods=>we can now define static methods in interfaces that 
//can be called independently without an object.
//Note: these methods are not inherited.


interface Anjali{
	void show();
	static void rosh() {
		System.out.println("Hey ji");
	}
}
public class Fifty implements Anjali{
	public void show() {
		System.out.println("Haan ji");
	}
	public static void main(String []args) {
		Anjali.rosh();//static method call
		Fifty f=new Fifty();
		f.show();
	}
}
