package first;
import java.util.*;
import java.util.stream.Collectors;
//JAVA 8 Streams
//he Stream API is used to process collections of objects.
//A stream is a sequence of objects that supports various 
//methods which can be pipelined to produce the desired result.
//Note: 

//If we want to represent a group of objects as a single entity then we should go for collection.
//But if we want to process objects from the collection then we should go for streams
//If we want to use the concept of streams then stream() is the method to be used.
//Stream is available as an interface.

//Stream s = c.stream();
//In the above pre-tag, ‘c’ refers to the collection. So on the collection, we are calling the stream() method and at the same time, we are storing it as the Stream object. Henceforth, this way we are getting the Stream object.
//
//Note: Streams are present in java’s utility package named java.util.stream

//A stream is not a data structure instead it takes input from the Collections, Arrays, or I/O channels.
//Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
//Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. 
//Terminal operations mark the end of the stream and return the result.
//Streams are lazy because intermediate operations are not evaluated until terminal operation is invoked.

//Intermediate ops==>Filter,Map,Sorted
//Terminal ops===>forEach,collect,count,reduce,match
//Note: For every object if there is urgency to do some operations be it square, double or any other than only we need to use map()
//function  operation else try to use filter() function operation. 
//Note: filter, sorted, and map, which can be connected together to form a pipeline.
public class Ninetynine {
public static void main(String [] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(3);
	list.add(1);
	list.add(0);
	list.add(8);
	list.add(23);
	list.add(7);
	
	System.out.println(list);//[3, 1, 0, 8, 23, 7]
	
	List<Integer> l=
			list.stream()
						.filter((i)->i%2==0)
							.collect(Collectors.toList());
	System.out.println(l);//[0, 8]
	List<Integer> l2=
			list.stream()
						.map(i->i+5)
							.collect(Collectors.toList());

	System.out.println(l2);//[8, 6, 5, 13, 28, 12]
}
}


//int sum=weights.stream().filter(w->w.getcolor()==RED).mapToInt(w->w.getweight()).sum();
//above returns sum of all weights of RED color;





