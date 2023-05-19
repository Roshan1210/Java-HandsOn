package first;//constructor overloading

public class Fortythree {
	int l;
	int b;
	int h;
	Fortythree(){
		l=b=h=0;
	}
	Fortythree(int l,int b,int h){
		this.l=l;
		this.b=b;
		this.h=h;
		
	}
	Fortythree(int l){
		this.l=l;
		this.b=l;
		this.h=l;
	}
	int area() {
		return l*b*h;
	}
	public static void main(String [] args) {
		Fortythree f=new Fortythree();
		System.out.println(f.area());
		Fortythree g=new Fortythree(25,10,10);
		System.out.println(g.area());
		Fortythree h=new Fortythree(25);
		System.out.println(h.area());
	}

}
