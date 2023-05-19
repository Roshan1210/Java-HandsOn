package first;//
import java.util.*;//sorting based on two criteria first rank than name

class SchoolComparator implements Comparator<School>{
	public int compare(School s1,School s2) {
		if(s1.rank<s2.rank) {
			return -1;
		}
		else if(s1.rank==s2.rank) {
			return s1.name.compareTo(s2.name);//imp
		}
		else {
			return 1;
		}
	}
}
class School{
	int rank;
	String board;
	String name;
	public School(int rank, String board, String name) {
		this.rank = rank;
		this.board = board;
		this.name = name;
	}
	@Override
	public String toString() {
		return "School [rank=" + rank + ", board=" + board + ", name=" + name + "]";
	}
	
	
	
}
public class Seventyone {
public static void main(String [] args) {
	List<School> l=new ArrayList<School>() ;
	School s1=new School(21,"CBSE","VPEMS");
	School s2=new School(23,"SSC","VPNEMS");
	School s3=new School(21,"ICSE","VPVGEMS");
	School s4=new School(12,"SSC","VPMMS");
	l.add(s1);
	l.add(s2);
	l.add(s3);
	l.add(s4);
	System.out.println(l);
	Collections.sort(l,new SchoolComparator());
	System.out.println(l);
	
	
}
}
