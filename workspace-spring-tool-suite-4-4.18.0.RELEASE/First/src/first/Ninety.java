package first;
//Lambda Expression
//
interface Computable{
	double compute(double d1,double d2);
}
interface ComputationUtils{
	static double performAnyOperation(double a,double b,Computable operation) {
		return operation.compute(a, b);
	}
}

 class Adder implements Computable{
	@Override
	public double compute(double d1,double d2) {
		return d1+d2;
	}
}

public class Ninety {
public static void main(String [] args) {
	System.out.println("addition "+ComputationUtils.performAnyOperation(10.0,20.0,new Adder()));
	System.out.println("Subraction "+ComputationUtils.performAnyOperation(100.0,20.0,new Computable() {
		@Override
		public double compute(double d1,double d2) {
			return d1-d2;
		}
	}
	));
	
}
}

//Anonymous inner class
//Java anonymous inner class is an inner class without a name and for which only a single object is created. 
//An anonymous inner class can be useful when making an instance of an object with certain "extras" 
//such as overloading methods of a class or interface, without having to actually subclass a class.
//In simple words, a class that has no name is known as an anonymous inner class in Java. 
//It should be used if you have to override a method of class or interface.
//Anonymous Inner class that defines inside method/constructor argument





