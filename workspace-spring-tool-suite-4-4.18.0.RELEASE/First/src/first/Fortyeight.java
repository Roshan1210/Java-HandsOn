package first;//Interfaces

//interface Ac{//Interfac
//	final int a=10;
//	void study();
//	
//}
//
//class Ab implements Ac{//implementation class 
//	public void study() {
//		System.out.println("Hiiii Kya kr rahe ho");
//	}
//}
//
//public class Fortyeight extends Ab{
//	public static void main(String [] args) {
//	Ab b=new Ab();
//	b.study();
//	System.out.println(a);
//		
//	}
//}

interface Prop{
	void color();
	void features();
	void fuel();
}

class Celerio implements Prop{
	
	public void color() {
		System.out.println("Grey color");
	}
	public void features() {
		System.out.println("ABS,EBD,Music system");
	}
	public void fuel() {
		System.out.println("Petrol-CNG");
	}
}

class Baleno implements Prop{
	
	public void color() {
		System.out.println("White color");
	}
	public void features() {
		System.out.println("ABS,EBD,Music system");
	}
	public void fuel() {
		System.out.println("Petrol");
	}
}


public class Fortyeight {
	public static void main(String [] args) {
		Baleno b=new Baleno();
		b.color();
		b.features();
		b.fuel();
		Celerio c=new Celerio();
		c.color();
		c.features();
		c.fuel();
		
	}
}
