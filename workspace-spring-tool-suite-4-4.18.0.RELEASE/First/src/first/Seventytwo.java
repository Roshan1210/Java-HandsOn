
//Inner (Anonymous)--->special variety of non-static nested inner class (nameless)
package first;
import java.util.*;
////Note--->instead of writing extra class for comparator we can write inner class 
//where entire class defn is embeded within a single java statement

//class SchoolsComparator implements Comparator<Schools>{
//	public int compare(Schools s1,Schools s2) {
//		if(s1.rank<s2.rank) {
//			return -1;
//		}
//		else if(s1.rank==s2.rank) {
//			return s1.name.compareTo(s2.name);//imp
//		}
//		else {
//			return 1;
//		}
//	}
//}
class Schools{
	int rank;
	String board;
	String name;
	public Schools(int rank, String board, String name) {
		this.rank = rank;
		this.board = board;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Schools [rank=" + rank + ", board=" + board + ", name=" + name + "]";
	}
	
	
	
}
public class Seventytwo {
public static void main(String [] args) {
	List<Schools> l=new ArrayList<Schools>() ;
	Schools s1=new Schools(21,"CBSE","VPEMS");
	Schools s2=new Schools(23,"SSC","VPNEMS");
	Schools s3=new Schools(21,"ICSE","VPVGEMS");
	Schools s4=new Schools(12,"SSC","VPMMS");
	l.add(s1);
	l.add(s2);
	l.add(s3);
	l.add(s4);
	System.out.println(l);
	Collections.sort(l,new Comparator<Schools>() {//imp java Anonymous inner class 
		@Override
		public int compare(Schools s1,Schools s2) {
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
	);
	System.out.println(l);
	
	
}
}