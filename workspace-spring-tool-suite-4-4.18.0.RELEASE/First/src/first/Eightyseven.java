package first;//JAVA 8 features===>Default methods
//Before Java 8, interfaces could have only abstract methods. The implementation of these methods has to be
//provided in a separate class. So, if a new method is to be added in an interface, then its implementation 
//code has to be provided in the class implementing the same interface. To overcome this issue, 
//Java 8 has introduced the concept of default methods which allow the interfaces to have methods with
//implementation without affecting the classes that implement the interface.
//interface Practice{
//	void show();
//	default void see() {//default method 
//		System.out.println("See");
//	}
//	
//}
//class Pract implements Practice{//imple class can override default and inherited methods 
//	public void show() {
//		System.out.println("Hey");
//	}
//}
//public class Eightyseven {
//public static void main(String [] args) {
//	Pract p=new Pract();
//	p.show();
//	p.see();
//}
//}

interface AZ{
	default void show() {
		System.out.println("show1");
	}
}
interface BZ{
	default void show() {
		System.out.println("show2");
	}
}
class AB implements AZ,BZ{
	@Override
	public void show() {
		System.out.println("show12");
		AZ.super.show();
		BZ.super.show();
	}
}
public class Eightyseven{
	public static void main(String [] args) {
		AB a=new AB();
		a.show();
	}
}

