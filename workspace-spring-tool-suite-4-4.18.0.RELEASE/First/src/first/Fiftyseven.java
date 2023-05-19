package first;//Equals method in String
//Object class equals check refn equality
//we need to override equals to chk for content equality (in string its is already overridden)

public class Fiftyseven {
public static void main(String [] args) {
	String s1=new String("testing strings");
	String s2=new String("testing strings");
	String s3=new String("TestinG Strings");
	System.out.println(s1==s2);//false=ref equalitty
	System.out.println(s1.equals(s2));//true(case sensitive)
	System.out.println(s1.equalsIgnoreCase(s3));//true(case insensitive)
	
	
}
}
