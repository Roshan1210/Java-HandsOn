package first;
//Anonymous Inner class that defines inside method/constructor argument
abstract class I{
	abstract void show();
}
class Impl{
	 void calc(I i){
	System.out.println("In Calc call");
	i.show();
	}
}
//class util extends I{
//	void show() {
//		System.out.println("In show  call");
//	}
//}
public class Ninetythree {
public static void main(String [] args) {
	Impl a=new Impl();
	a.calc(new I() {
		@Override
		void show() {
		System.out.println("In show  call");
	}
	});
}
}
