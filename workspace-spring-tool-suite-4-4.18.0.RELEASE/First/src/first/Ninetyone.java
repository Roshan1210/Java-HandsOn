package first;
//Anonymous Inner Class1)extending class 2)by implementing interface3)Anonymous Inner class that defines inside method/constructor argument
//1)
class AC{
	void show() {
		System.out.println("In AC");
	}
}
//class BC extends AC{
//	@Override
//	void show() {//Instead of creating extra class make annonymous inner class 
//		System.out.println("In BC overriding method ");
//	}
//}

public class Ninetyone {
public static void main(String [] args) {
	AC a=new AC();
	a.show();
	AC b=new AC() {
		@Override
		void show() {
			System.out.println("In Anonymous class implementing overriding method in sub class");
		}
	};
	b.show();
}
}
