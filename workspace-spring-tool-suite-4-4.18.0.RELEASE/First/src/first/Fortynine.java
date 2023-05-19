package first;//default methods in interfaces from jdk 8
//default methods=>Suppose we need to add a new function in an existing interface.
//Obviously, the old code will not work as the classes have not implemented those new functions. 
//So with the help of default implementation, we will give a default body for the newly added functions.
//Then the old codes will still work.
interface Tum{
	void show();
	default void guess() {//default method
		System.out.println("Suna naa-Bolo naa");
	}
}

public class Fortynine implements Tum {
	public void show() {
		System.out.println("Hiiiii.....!!!!!!");
	}
public static void main(String[] args) {
	Tum t=new Fortynine();
	t.show();
	t.guess();
	
}
}
