package first;
//chk this imp
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Studen{
	int id;
	String str;
	public Studen(int id, String str) {
		this.id = id;
		this.str = str;
	}
	@Override
	public String toString() {
		return "Studen [id=" + id + ", str=" + str + "]";
	}
	
	
}
public class Ninetyseven {
public static void main(String [] args) {
	List<Studen> l=new ArrayList<>();
	int a=0;
	l.add(new Studen(1,"roshan"));
	l.add(new Studen(5,"rohan"));
	l.add(new Studen(2,"rohit"));
	l.add(new Studen(4,"roshani"));
	System.out.println(l);
	Map<Integer,Studen> m=new HashMap<>();
	for(Studen s:l) {
		a++;
		m.put(a,s);
	}
	//display all students (list) using declarative (fun) style
	l.forEach(s->System.out.print(s+" "));
	System.out.println();
	
	//display all student details(Map)
	m.forEach((k,v)->System.out.print(v+" "));
	
}
}
