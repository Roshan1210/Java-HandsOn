package first;
//2)Deep copy


	class Test11{
		int x,y;
	}
	class Test22 implements Cloneable{
		int a;
		int b;
		Test11 c=new Test11();//contains reference of test
		public Object clone () throws CloneNotSupportedException{
			
			Test22 t=(Test22)super.clone();
			t.c=new Test11();
			t.c.x=c.x;
			t.c.y=c.y;
			return t;
		}
	}
	public class Hundredsix {
	public static void main( String[] args) throws CloneNotSupportedException {
		Test22 t1=new Test22();
		t1.a=10;
		t1.b=20;
		t1.c.x=100;
		t1.c.y=200;
		
		Test22 t2=(Test22)t1.clone();
		t2.a=11;
		t2.b=21;
		
		t2.c.x=300;
		
		
		System.out.println(t1.a+" "+t1.b+" "+t1.c.x+" "+t1.c.y+" ");
		System.out.println(t2.a+" "+t2.b+" "+t2.c.x+" "+t2.c.y+" ");
	}
	}

	
	
