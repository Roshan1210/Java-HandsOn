package first;
//Object cloning

//Object cloning refers to the creation of an exact copy of an object.
//It creates a new instance of the class of the current object and initializes all its
//fields with exactly the contents of the corresponding fields of this object.

//In Java, there is no operator to create a copy of an object. Unlike C++, in Java,
//if we use the assignment operator then it will create a copy of the reference variable and not the object.

//The object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.

//The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. 
//If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.

//1)Shallow copy
class Test1{
	int x,y;
}
class Test2 implements Cloneable{
	int a;
	int b;
	Test1 c=new Test1();//contains reference of test
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
		
	}
}
public class Hundredfive {
public static void main( String[] args) throws CloneNotSupportedException {
	Test2 t1=new Test2();
	t1.a=10;
	t1.b=20;
	t1.c.x=100;
	t1.c.y=200;
	
	Test2 t2=(Test2)t1.clone();
	t2.a=11;
	t2.b=21;
	
	t2.c.x=300;//referenes is copied and pointing to same references so changes in original object of Test1 class 
	
	System.out.println(t1.a+" "+t1.b+" "+t1.c.x+" "+t1.c.y+" ");
	System.out.println(t2.a+" "+t2.b+" "+t2.c.x+" "+t2.c.y+" ");
}
}
