package first;
// more about Lambda expression 
//Lambda expression is a new and important feature of Java which was included in Java SE 8. 
//It provides a clear and concise way to represent one method interface using an expression. 
//It is very useful in collection library. It helps to iterate, filter and extract data from collection.
//
//The Lambda expression is used to provide the implementation of an interface which has functional interface.
//It saves a lot of code. In case of lambda expression, we don't need to define
//the method again for providing the implementation. Here, we just write the implementation code.
//
//Java lambda expression is treated as a function, so compiler does not create .class file.

interface Zz{
	void show();
}
//class XZ implements Zz{
//	public void show() {
//		System.out.println("In XZ implementation method of interface");//instead of implementing interface in class write anonymous class 
//	}
//}
public class Ninetyfour {
public static void main(String [] args) {
//Zz a=new Zz() {
//	@Override
//	public void show() {
//		System.out.println("In anonymous class  implementation method of interface");
//	}
//};
//*************above code by using lambda expression****************//
	
Zz a=()	->{//lambda expression
	System.out.println("In anonymous class  implementation method of interface");
};
a.show();
System.out.println(a.getClass().getName());//first.Ninetytwo$1
}
}

//chk below diff scenarios of lambda expressions
//
//interface Sayable{  
//    public String say();  
//}  
//public class LambdaExpressionExample3{  
//public static void main(String[] args) {  
//    Sayable s=()->{  
//        return "I have nothing to say.";  
//    };  
//    System.out.println(s.say());  
//}  
//}  

//interface Sayable{  
//    public String say(String name);  
//}  
//  
//public class LambdaExpressionExample4{  
//    public static void main(String[] args) {  
//      
//        // Lambda expression with single parameter.  
//        Sayable s1=(name)->{  
//            return "Hello, "+name;  
//        };  
//        System.out.println(s1.say("Sonoo"));  
//          
//        // You can omit function parentheses    
//        Sayable s2= name ->{  
//            return "Hello, "+name;  
//        };  
//        System.out.println(s2.say("Sonoo"));  
//    }  
//}  

//interface Addable{  
//    int add(int a,int b);  
//}  
//  
//public class LambdaExpressionExample5{  
//    public static void main(String[] args) {  
//          
//        // Multiple parameters in lambda expression  
//        Addable ad1=(a,b)->(a+b);  
//        System.out.println(ad1.add(10,20));  
//          
//        // Multiple parameters with data type in lambda expression  
//        Addable ad2=(int a,int b)->(a+b);  
//        System.out.println(ad2.add(100,200));  
//    }  
//}  


//interface Addable{  
//    int add(int a,int b);  
//}  
//  
//public class LambdaExpressionExample6 {  
//    public static void main(String[] args) {  
//          
//        // Lambda expression without return keyword.  
//        Addable ad1=(a,b)->(a+b);  
//        System.out.println(ad1.add(10,20));  
//          
//        // Lambda expression with return keyword.    
//        Addable ad2=(int a,int b)->{  
//                            return (a+b);   
//                            };  
//        System.out.println(ad2.add(100,200));  
//    }  
//}  

