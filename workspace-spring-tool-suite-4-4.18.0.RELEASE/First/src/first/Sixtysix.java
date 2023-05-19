package first;
import java.util.*;
//Collection framework -Arraylist
public class Sixtysix {
public static void main(String [] args) {
	//ArrayList<Integer> l1=new ArrayList<>();size 0,capacity 10
	ArrayList<Integer> l1=new ArrayList<>(100);//initial capacity arguments
	l1.add(1);//auto boxing int to Integer
	l1.add(2);//ArrayList-->ordered elements(maintains same order),allows duplicates,allows null
	l1.add(3);
	l1.add(4);
	l1.add(5);
	l1.add(6);
	int [] data= {10,23,45,12,11};
	ArrayList<Integer> l2=new ArrayList<>();
	
	for(int i:data) {//for each loop
		l1.add(i);
	}
	l2.addAll(l1);
	System.out.println(l1);//[1, 2, 3, 4, 5, 6, 10, 23, 45, 12, 11]--->calls toString() overridden method
	for(int j:l1) {
		System.out.print(j);//can attach implicit iterator(for each )
		System.out.print(",");
	}
	System.out.println();
	for(int k=0;k<l1.size();k++) {
		System.out.print(l1.get(k));//printing list using for loop
		System.out.print(",");
	}
	System.out.println();
	//l1.add(0, 34);
	//l1.clear();
	//l1.contains(10);
	//l1.indexOf(45);
	//l1.isEmpty();
	//l1.set(0, 9)
	//l1.remove(11);
	
	Iterator<Integer> itr=l1.iterator();//printing list using iterator
	while(itr.hasNext()) {
		System.out.print(itr.next());
		System.out.print(",");
		
		itr.remove();//Iterator allows the caller to remove elements from the underlying 
		//collection during the iteration.
	}
	System.out.println();
	System.out.println(l1);//empty list becoz of remove();
	System.out.println();
	
	System.out.println(l2);
	ListIterator<Integer> itr1=l2.listIterator(l2.size());//only for list (here we are passing
	//size argument to place iterator at last element to traverse from reverse( we can bidirectional traverse with this iterator)
	while(itr1.hasPrevious()) {
		System.out.print(itr1.previous()+" ");//11 12 45 23 10 6 5 4 3 2 1 
	}
}
}
