package first;
import java.util.*;//Lowerbound wildcards
public class Seventynine {
	private static void printOnlyIntegerClassOrSuperClass(List<? super Integer> list) {
		System.out.println(list);
	}
public static void main(String [] args) {
	List<Integer> l1=Arrays.asList(1,3,6,8,9);
	printOnlyIntegerClassOrSuperClass(l1);
	List<Integer> l2=Arrays.asList(1,3,6,8,9);
	printOnlyIntegerClassOrSuperClass(l2);
}
}
//Here arguments can be Integer or superclass of Integer(which is Number). 
//The method printOnlyIntegerClassorSuperClass will only take Integer or its superclass objects.
//However, if we pass a list of types Double then we will get a compilation error. 
//It is because only the Integer field or its superclass can be passed. Double is not the superclass of Integer.
//
//Note: Use extend wildcard when you want to get values out of a structure and super wildcard 
//when you put values in a structure. Don’t use wildcard when you get and put values in a structure. 
//You can specify an upper bound for a wildcard, or you can specify a lower bound, but you cannot specify both.

