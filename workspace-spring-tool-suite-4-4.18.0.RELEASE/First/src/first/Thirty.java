package first;//methods call

public class Thirty {
	static void m3(){
	
		
		System.out.println("Hey hi roshan");
		
	}
	static void m2(){
		m3();
	}
	static void m1(){
		m2();
	}
	public static void main(String [] args) {
		m1();
		m2();
		m3();
		
	}

}
