package first;

import java.util.*;

//More HOF
//converting list into MAP
class Stud{
	int id;
	String str;
	public Stud(int id, String str) {
		this.id = id;
		this.str = str;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", str=" + str + "]";
	}
	
	
}
public class Ninetysix {
public static void main(String [] args) {
	List<Stud> l=new ArrayList<>();
	l.add(new Stud(1,"roshan"));
	l.add(new Stud(5,"rohan"));
	l.add(new Stud(2,"rohit"));
	l.add(new Stud(4,"roshani"));
	System.out.println(l);//[Stud [id=1, str=roshan], Stud [id=5, str=rohan], Stud [id=2, str=rohit], Stud [id=4, str=roshani]]
	
	Map<Integer,String> m=new HashMap<>();
	for(Stud s:l) {
		m.put(s.id, s.str);
	}
	System.out.println(m);//{1=roshan, 2=rohit, 4=roshani, 5=rohan}
	m.forEach((k,v)->System.out.print(k+":"+v+" , "));//1:roshan , 2:rohit , 4:roshani , 5:rohan
	
	//Sorting list according to name
	//Collections.sort(List<T> list,Comparator<? super T> c);
	Collections.sort(l, (s1,s2)->s1.str.compareTo(s2.str));
	System.out.println(l);//[Stud [id=5, str=rohan], Stud [id=2, str=rohit], Stud [id=1, str=roshan], Stud [id=4, str=roshani]]

	
	//Note-->Can you assign entire fun def to a variable=YES
	
	Comparator<Stud> studcomp=(s1,s2)->s1.str.compareTo(s2.str);//studcomp is called as function literal 
	Collections.sort(l, studcomp);
}
}
