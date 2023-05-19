package first;
import java.util.*;//Set<E>===>no dups,no index ops,single null ref only,traversed by for each and iterator only
public class Eightytwo {
public static void main(String [] args) {
	List<Integer> l1=Arrays.asList(10,20,30,40,60,70,50,90,100,80);//dups allowed,ordered,un sorted
	System.out.println(l1);//[10, 20, 30, 40, 60, 70, 50, 90, 100, 80]
	HashSet<Integer> hs1=new HashSet<>(l1);//unordered ,unsorted
	System.out.println(hs1);//[80, 50, 20, 100, 70, 40, 10, 90, 60, 30]
	//*****************using iterator***********************//
	Iterator<Integer> itr=hs1.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
		
		
		
	}
	hs1.add(45);
	System.out.println();
	
	System.out.println(hs1);
}
}
