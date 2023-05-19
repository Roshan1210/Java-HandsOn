package first;
import java.util.*;
//Higher order functions
//A higher order function is a function that takes a function as an argument, or returns a function 
// The result of one higher-order function can be used as the input to another higher-order function.
//Any time we pass a lambda expression to a method, that method is a higher-order function.
//A higher-order function can be defined as a function that accepts one 
//or more functions as arguments and returns a function as a result.
//forEach, map, CompactMap, flatMap, filter, reduce, sort, and sorted.

public class Ninetyfive {
	
public static void main(String [] args) {
	//create a fixed size list of integers n display it using internal iteration (forEach)
	//Performs the given action for each element of the Iterableuntil all elements have been processed
//	or the action throws anexception. Actions are performed in the order of iteration, if thatorder is
//	specified. Exceptions thrown by the action are relayed to thecaller.
	List<Integer> list=Arrays.asList(12,34,11,8,90,23);
	//default void forEach (Consumer <? Super T> action)
//	list.forEach(new Consumer<Integer>() {
//		@Override
//		public void accept(Integer t) {
//			System.out.println(t);
//		}
//	});
	System.out.println("Listing contents via lambda expressions");
	list.forEach(i->System.out.print(i+" "));
	System.out.println();
	
	//create a fixed size list of Integers and remove all odd elements and print list 
	ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(2,3,7,9,34,22,46,1));
	
	list1.removeIf(t->t%2!=0);
//	list1.removeIf(new Predicate<Integer>(){
//		@Override
//		public boolean test(Integer t) {
//			return t%2!=0;
//		}
//	});
	//removeIf internally uses iterator (removes element that satisfy this condition in collection )
	//Interface Predicate is a filter is a functional interface
	//Removes all of the elements of this collection that satisfy the givenpredicate.
	//Errors or runtime exceptions thrown during iteration or bythe predicate are relayed to the caller.
	System.out.println(list1);
	
	
	
}
}
