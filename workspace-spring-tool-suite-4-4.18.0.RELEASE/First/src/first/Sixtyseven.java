package first;
import java.util.*;
//sorting collection
public class Sixtyseven {
public static void main(String [] args) {
	int[] arr= {23,45,12,11,5,2,0,67,34};
	ArrayList<Integer> l1=new ArrayList<>();
	for(int j:arr) {
		l1.add(j);
	}
	Arrays.sort(arr);
	for(int i:arr) {
		System.out.print(i+" ");//0 2 5 11 12 23 34 45 67 
	}
	
	System.out.println();
	System.out.println(l1);
	Collections.sort(l1);
	System.out.println(l1);//[0, 2, 5, 11, 12, 23, 34, 45, 67]natural sorting ascending order
	Collections.sort(l1, Collections.reverseOrder());
	System.out.println(l1);//[67, 45, 34, 23, 12, 11, 5, 2, 0] descending order sorting
}
}
