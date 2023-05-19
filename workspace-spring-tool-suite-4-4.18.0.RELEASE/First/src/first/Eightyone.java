package first;
import java.util.*;//A method in Vector
public class Eightyone {
public static void main(String [] args) {
	Vector<Integer> v1=new Vector<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));//growable vector
	v1.add(0, 999);
	System.out.println(v1);//[999, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	Collections.shuffle(v1);//shuffling refs.
	System.out.println(v1);//[4, 1, 8, 6, 9, 10, 3, 999, 2, 7, 5]
	System.out.println();
	List<Double> list=Arrays.asList(1.1,2.3,5.6,8.9);
	System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);
}
}
