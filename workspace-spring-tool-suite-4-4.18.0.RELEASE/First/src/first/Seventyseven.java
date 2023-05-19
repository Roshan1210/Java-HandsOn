package first;//more methods in collection list
import java.util.*;
public class Seventyseven {
public static void main(String [] args) {
	List<Integer> l=Arrays.asList(10,20,30,40,50);//creating fix size list form integers or any arrays or var ags(doing auto-boxing)
	System.out.println(l);
	System.out.println(l.set(1, 60));//this is a fixed size list
	//l.add(234);------>gives exception fixed size list 
	
	
	//*************we can create growable size linkedlist with Arrays.asList method******************.
	List<String> l1=Arrays.asList("1","2","3","4","5","6","7","8","9","10");
	LinkedList<String> l2=new LinkedList<>(l1);
	l2.add("123");
	//l1.add("roshan");//gives exception as fixed size list
	
	
	
}
}
