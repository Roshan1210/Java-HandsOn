package first;


class A{
	A(){
		super();
		System.out.println("A called");
	}
	
}
class B extends A{
	B(){
		super();
		System.out.println("B called");
	}
}
class C extends B{
	C(){
		super();
		System.out.println("C called");
	}
}

public class Forty {
	public static void main(String [] args) {
		C c=new C();
	}

}
