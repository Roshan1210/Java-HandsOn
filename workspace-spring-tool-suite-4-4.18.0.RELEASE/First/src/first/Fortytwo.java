package first;//upcasting(Student IS A Person 

class Person{
	String a;
	String b;
	Person(){}
	Person(String a,String b){
		this.a=a;
		this.b=b;
		
	}
	void display() {
		System.out.println("a=>"+this.a+" b=>"+this.b);
	}
	@Override
	public String toString() {
		return "a=>"+this.a+" b=>"+this.b;
	}
}
class Student extends Person{
	String c;
	String d;
	Student(String c,String d){
		this.c=c;
		this.d=d;
	}
	@Override
	public String toString() {
		return "c=>"+this.c+" d=>"+this.d;
	}
	@Override
	void display() {
		System.out.println("c=>"+this.c+" d=>"+this.d);
	}
}
class Faculty extends Person{
	String e;
	String f;
	Faculty(String e,String f){
		this.e=e;
		this.f=f;
	}
	@Override
	public String toString() {
		return "e=>"+this.e+" f=>"+this.f;
	}
	@Override
	void display() {
		System.out.println("e=>"+this.e+" f=>"+this.f);
	}

}

public class Fortytwo {
public static void main(String[] args) {
	Person p=new Person("a","b");
	System.out.println(p);
	Person p1=new Student("c","d");
	System.out.println(p1);
	p1.display();
	Person p2=new Faculty("e","f");
	p2.display();
	System.out.println(p2);
}
}
