package first;
import java.util.*;

import java.util.stream.IntStream;
//More about streams
public class Hundred {
public static void main(String [] args) {
	int[] data= {23,45,12,11,6,45};//
	IntStream i=Arrays.stream(data);//creating stream from int array
	i.forEach(System.out::println);//displaying stream
	System.out.println();
	ArrayList<Integer> list=new ArrayList<>(Arrays.asList(23,12,11,6,3,4,2,1));
	list.stream().forEach(j->System.out.print(j+" "));//23 12 11 6 3 4 2 1-->sequential stream,ordered o/p
	System.out.println();
	list.parallelStream().forEach(j->System.out.print(j+" "));//4 3 1 2 12 6 11 23 --->unordered o/p parallel stream multi- threading
	
}
}
// The most significant distinction between stateful and stateless is that stateless do not “save” data, whereas stateful applications do