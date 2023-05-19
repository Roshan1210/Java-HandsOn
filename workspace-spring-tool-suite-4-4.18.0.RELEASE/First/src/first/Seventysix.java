package first;//LinkedList()
import java.util.*;
public class Seventysix {
public static void main(String [] args) {
	LinkedList<String> l1=new LinkedList<String>();
	Collections.addAll(l1,"one","two","three","four");
	System.out.println(l1);
	
	Iterator<String> itr=l1.descendingIterator();//reverse order(tail to head position)
	while(itr.hasNext()) {
		System.out.print(itr.next()+" , ");//printing in reverse order
	}
//	l1.add("roshan");
//	l1.add(1, "sharma");
//	l1.addFirst("hi");
//	l1.addLast("ye");
//	l1.addAll(l1);
//	l1.addAll(0, l1);
//	l1.clear();
//	l1.contains("roshan");
//	l1.containsAll(l1);
//	l1.element();//Retrieves, but does not remove, the head (first element) of this list.
//	l1.get(0);
//	l1.getFirst();
//	l1.getLast();
//	l1.offer("yell");//Adds the specified element as the tail (last element) of this list.
//	l1.offerFirst("iii");
//	l1.peek();//Retrieves, but does not remove, the head (first element) of this list.
//	l1.peekFirst();
//	l1.poll();//Retrieves and removes the head (first element) of this list.
//	l1.pollFirst();
//	l1.pop();
//	l1.push("trrr");
//	l1.remove();//Retrieves and removes the head (first element) of this list.
//	l1.remove(0);
//	l1.removeFirst();
	
	
	
}
}
