package first;//String Basics
//String object is immutabe but string ref is mutable
public class Fiftysix {
public static void main(String [] args) {
	String s1=new String("Hello");//non-literal
	s1.concat("hi");
	System.out.println(s1);//Hello
	s1+="12345";//s1=s1+"12345"(concatenation)
	System.out.println(s1);//Hello12345
	String s="roshan";//literal string
	System.out.println(s);//roshan
	String s2=s1.concat("abc");//assigned to new reference;
	System.out.println(s2);//Hello12345abc
	System.out.println(s1);//Hello123454
	s2=s1.toUpperCase();
	System.out.println(s2);//HELLO12345
	System.out.println(s1);//Hello12345
	s1.replace('1', 'r');
	System.out.println(s1.replace('1', 'r'));//Hellor2345
	System.out.println(s1);//Hello12345
	//************String Equals******************
	
	
}
}
