package first;

public class Thirtyseven {
	static int i;
	int j;
	Thirtyseven(){
		j=5;
		System.out.println("constructor called");
		
	}
	static {
		i=10;
		System.out.println("hello");//static initializer block called first before constructor also
	}
	public static void main(String [] args) {
		Thirtyseven s=new Thirtyseven();
		System.out.println("hello roshan");
		System.out.println(Thirtyseven.i);
		
	}

}
