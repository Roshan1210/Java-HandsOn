package first;
import java.util.*;//Unbounded Wildcard: 

public class Eighty {
	
	 private static void printlist(List<?> list)
	    {
	 
	        System.out.println(list);
	    }
public static void main(String [] args) {
	List<Integer> list1 = Arrays.asList(1, 2, 3);
	 
    // Double list
    List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);

    printlist(list1);

    printlist(list2);
}
}
//AL<?> l1=new AL<>();(implicit type of RHS is Object
//AL<Mgr> l2=new AL<>();
//l1=l2;====>no error;