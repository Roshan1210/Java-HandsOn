package first;
//2)Interface implementing Anonymous class
interface Z{
	void show();
}
//class XZ implements Z{
//	public void show() {
//		System.out.println("In XZ implementation method of interface");//instead of implementing interface in class write anonymous class 
//	}
//}
public class Ninetytwo {
public static void main(String [] args) {
Z a=new Z() {
	@Override
	public void show() {
		System.out.println("In anonymous class  implementation method of interface");
	}
};
a.show();
System.out.println(a.getClass().getName());//first.Ninetytwo$1
}
}
//A normal class can implement any number of interfaces but the anonymous inner class can implement only one interface at a time.
//A regular class can extend a class and implement any number of interfaces simultaneously. But anonymous Inner
//class can extend a class or can implement an interface but not both at a time.
//For regular/normal class, we can write any number of constructors but we can’t write any 
//constructor for anonymous Inner class because the anonymous class does not have any name and while 
//	defining constructor class name and constructor name must be same.


