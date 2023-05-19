package first;//Upcasting and downcasting


class Sperson{
	int a;
	Sperson(){
		a=1;
	}
	void res() {
		System.out.println("Person");
	}
	
	void per() {
		System.out.println("Person class method");
	}
	
}
class Sstudent extends Sperson{
	String c;
	Sstudent(){
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
public class Fortyfive {
public static void main(String [] args) {
	Sperson s=new Sperson();
	s.res();
	s.per();
	System.out.println(s.a);
	System.out.println();
	//s.stu();parent class cannot access child members(methods and variables)
	
	Sstudent t=new Sstudent();
	System.out.println(t.a);
	System.out.println(t.c);
	t.res();
	t.stu();
	t.per();//all parent class members is accessible by child class (inheritance)IS A relationship
	System.out.println();
	
	Sperson v=new Sstudent();//upcasting(parent class members+child class overriden methods accessible )
	System.out.println(v.a);
	v.res();//overriden method of child class called
	v.per();
	System.out.println();
	
//	Sstudent w=(Sstudent)new Sperson();//classcastexception
//	System.out.println(w.a);
//	System.out.println(w.c);
//	w.res();
//	w.per();
//	w.stu();
	System.out.println();
	
	Sstudent w1=(Sstudent)v;
	System.out.println(w1.a);
	System.out.println(w1.c);
	w1.res();
	w1.per();
	w1.stu();
	
	

	
	
	
	
	
}
}
