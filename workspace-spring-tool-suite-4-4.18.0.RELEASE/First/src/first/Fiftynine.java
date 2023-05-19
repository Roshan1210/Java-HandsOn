package first;//string methods

public class Fiftynine {
public static void main(String [] args) {
	String s="Roshan";
	System.out.println(s.charAt(0));//R
	System.out.println(s.charAt(4));//a
	System.out.println(s.contains("osh"));//true
	System.out.println(s.indexOf("o"));//1
	String s1="Roshan";
	String s2=s1.toUpperCase();
	String s3=s1.toLowerCase();
	System.out.println(s1.compareTo(s));//
	System.out.println(s1.compareTo(s2));//32
	System.out.println(s1.compareTo(s3));//-32
	
	
	
}
}
