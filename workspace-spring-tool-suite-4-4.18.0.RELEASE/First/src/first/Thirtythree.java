package first;
import java.util.*;

public class Thirtythree {
	int m;
	int n;
	Thirtythree(int m,int n){
		this.m=m;
		this.n=n;
	}
	void read() {
		System.out.println(m+" "+n);
	}
	public static void main(String [] args) {
		
		Thirtythree t=new Thirtythree(4,5);
		t.read();
		Thirtythree u=new Thirtythree(5,6);
		u.read();
		u=t;
		u.read();
		
	
		  
	}

}
