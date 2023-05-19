package first;//Instanceof operator and classcastexception
//instanceof is a keyword that is used for checking if a reference variable is
//containing a given type of object reference or not.
//he java instanceof operator is used to test whether the object is an instance of the specified
//type (class or subclass or interface).
class Lperson{
	int a;
	Lperson(){
		a=1;
	}
	void res() {
		System.out.println("Person");
	}
	
	void per() {
		System.out.println("Person class method");
	}
	
}
class Lstudent extends Lperson{
	String c;
	Lstudent(){
		c="roshan";
	}
	@Override
	void res() {
		System.out.println("Student");
	}
	void stu() {
		System.out.println("Student class method");
	}
}
public class Fortysix {
public static void main(String [] args) {
	Lperson s=new Lperson();
	s.res();
	s.per();
	System.out.println(s.a);
	System.out.println();
	//s.stu();parent class cannot access child members(methods and variables)
	
	Lstudent t=new Lstudent();
	System.out.println(t.a);
	System.out.println(t.c);
	t.res();
	t.stu();
	t.per();//all parent class members is accessible by child class (inheritance)IS A relationship
	System.out.println();
	
	Lperson v=new Lstudent();//upcasting(parent class members+child class overriden methods accessible )
	System.out.println(v.a);
	v.res();//overriden method of child class called
	v.per();
	System.out.println();
	
//	Lstudent w=(Lstudent)new Lperson();//classcastexception

	System.out.println();
	
	Lstudent w1=(Lstudent)v;
	System.out.println(w1.a);
	System.out.println(w1.c);
	w1.res();
	w1.per();
	w1.stu();
	
	if(w1 instanceof Lperson) {	//Lstudent w1=(Lstudent)v;Lperson v=new Lstudent();
	System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
	if(w1 instanceof Lstudent) {	
		System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	if(s instanceof Lperson) {	//Lperson s=new Lperson();
		System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	if(s instanceof Lstudent) {	//false
		System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	if(t instanceof Lperson) {	//Lstudent t=new Lstudent();
		System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	if(t instanceof Lstudent) {	
		System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	if(v instanceof Lperson) {	
		System.out.println("True");//Lperson v=new Lstudent();
		}
		else {
			System.out.println("False");
		}
	if(v instanceof Lstudent) {	
		System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
}		
}