package first;

//Wrapper classes---->classes equivalent for primitive types(int,char,byte,long,short,double,float,boolean)
//A Wrapper class in Java is a class whose object wraps or contains primitive data types.
// In other words, we can wrap a primitive value into a wrapper class object
public class Sixtythree {
public static void main(String [] args) {
	//Conversion from primitive to wrapper aka Boxing
	int a=5;
	double b=6.8;
	//Integer ref=new Integer(a)--->Deprecated way
	Integer i=Integer.valueOf(a);//Boxing
	Double d=Double.valueOf(b);
	int a1=i.intValue();
	System.out.println(a1);//5--->unboxing
	double b1=d.doubleValue();
	System.out.println(b1);//6.8
	//******************
	Integer i2=100;//Autoboxing done by javac
	int data=i2;//Autounboxing
	System.out.println(data);
	i2++;//auto unboxing(Integer to int)---->increment--->auto boxing(int to Integer)
	System.out.println(i2);
	
	
}
}
