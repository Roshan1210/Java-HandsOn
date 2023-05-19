package first;
//Functional Interface---->An interface which has just one single abstract method(SAM) is called as Functional interface.
//Runnable,comparator,comparable,Iterable etc.
//@Functional_Interface
//Functional interface references can be substituted by Lambda Expressions,method references OR constructor references
 interface AY {
	 double calc(int a,int b);
}
 //interface BY extends AY{}-->true
 //interface CY extends AY{void show();}-->false
 //interface DY extends AY{default void show(){}}-->true
 //interface FY extends AY{static void test(){}}---->true
 
public class Eightynine {
public static void main(String [] args) {
	
}
}
