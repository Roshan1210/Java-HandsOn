package first;//literal vs non-literal
//JVM treats literal and non-literal string differently
public class Fiftyeight {
public static void main(String [] args) {
	String s1="hello";//literal string
	String s2=new String(s1);//non-literal string object
	System.out.println(s2);//hello
	String s3="hello";
	String s4="Hello";
	System.out.println(s1==s2);//false
	System.out.println(s1.equals(s2));//true
	System.out.println(s1==s3);//true SCP-->String constant pool /Literal String pool
	System.out.println(s1.equals(s3));//true
	System.out.println(s1==s4);//false
	System.out.println(s1.equals(s4));//false
	s1=s2=s3=s4=null;
	//Q)How many obj are marked for Garbage Collection --->only one i.e S2 (non-literal string only)
	//Note=>After nullyfying thr literal string pool is not yet marked for GC .
	//it holds them till entire string pool is removed/GC from the memory
	//which will happen only when string class is unloaded from the memory .
	//which will typically happens when the JVM Terminates
	//string hashcode() value depends on content of string
	//Can we make non literal string object a part of SCP -->YES
	String s5="hello";
	String s6=s5.intern();
	String s9="testing";
	System.out.println(s6==s5);//true
	String s7=new String("testing").intern();
	System.out.println(s7==s9);//true
	
	
	
	
	
	
			
}
}
