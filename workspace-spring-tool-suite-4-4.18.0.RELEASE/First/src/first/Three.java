package first;

public class Three {
	Three()
	{
		
	}
	String fun() {
		System.out.println("hello");
		String s="hi";
		return s;
	}
	
	public static void main(String [] args) {
		Three t=new Three();
		String su=t.fun();
		System.out.println(su);
		
		
	}

}
