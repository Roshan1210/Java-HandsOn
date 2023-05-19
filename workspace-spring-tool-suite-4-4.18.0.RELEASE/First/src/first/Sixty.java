package first;//String builder(it is mutable)

public class Sixty {
public static void main(String [] args) {
	StringBuilder sb1=new StringBuilder("hello");
	System.out.println("contents"+sb1+sb1.length()+sb1.capacity());//contentshello521
	StringBuilder sb2=sb1.append("123.45");
	System.out.println(sb2);//hello123.45
	System.out.println(sb1);//hello123.45
	System.out.println(sb1==sb2);//true
	StringBuilder sb3=new StringBuilder("testing");
	StringBuilder sb4=new StringBuilder("testing");
	System.out.println(sb3==sb4);//false
	System.out.println(sb3.equals(sb4));//false==SB doesnot overide equals mrthod so only ref equality
	sb1.reverse();
	System.out.println(sb1);//54.321olleh
	
	
	
	
	
	
}
}
