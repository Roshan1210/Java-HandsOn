package first;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
//Reflection in java

//Reflection is an API that is used to examine or modify the behavior of methods, classes, and interfaces at runtime
//Reflection gives us information about the class to which an object belongs and also the methods of that 
//class that can be executed by using the object.
//Through reflection, we can invoke methods at runtime irrespective of the access specifier used with them.

//Reflection can be used to get information about class, constructors, and methods
//I’ve found reflection is very good for testing code. In the research world it is sometimes very 
//beneficial to take advantage of its dynamic capabilities. You can also use it to by pass private, protected, 
//etc. Again this is done for analyzing a class rather then for use in real world code.





public class Hundredeight {
	
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String [] args) {
	// Getting the class Object for UFOEnemyShip
	// Everything in Java has a Class Object
	Class c=Sumans.class;
//	Class z=Class.forName("Sumans"); another way to create object
	
	String className=c.getName();
	System.out.println(className);//first.Sumans
	
	 // Check modifiers of a class
     // isAbstract, isFinal, isInterface, isPrivate, isProtected,
	 // isStatic, isStrict, isSynchronized, isVolatile
	int classModifiers =c.getModifiers();
	System.out.println(Modifier.isPublic(classModifiers));//true
	// You can get a list of interfaces used by a class
	
	Class[] interfaces=c.getInterfaces();
	for(Class i:interfaces) {
		System.out.print(i+" ");//interface first.Jangid interface first.Patil 
	}
	System.out.println();
	Class classSuper=c.getSuperclass();
	System.out.println(classSuper.getName());//first.Bhopal
	
	// Get the objects methods, return type and parameter type
	
	Method[] getmethods=c.getMethods();
	for(Method m:getmethods) {
		System.out.print(m.getName()+" ,");
	
	 // Check if a method is a getter or setter
	if(m.getName().startsWith("get")){
		System.out.println("Method is getter ");
	}
	else if(m.getName().startsWith("set")) {
		System.out.println("Method is setter ");
	}
	// Get the methods return type
	System.out.print(m.getReturnType()+" ,");
	// List parameters for a method
	Class[] listofParameters=m.getParameterTypes();
	for(Class a:listofParameters) {
		System.out.print(a.getName()+" ,");
	}
	System.out.println();
	}
	// How to access class constructors
	System.out.println();
//	To return an array of constructors instead do this
	Constructor[] constructors=c.getConstructors();
	for(Constructor a:constructors) {
		System.out.print(a.getName()+" ,");
	}

	// Call a constructor by passing parameters to create an object
	             
	@SuppressWarnings("unused")
	Object constructor2 = null;

	            try {
					constructor2 = c.getConstructor(int.class, String.class,int.class).newInstance(12, "Random String",13);
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	         //There are many more methods 
	            
	                     

	            
}
}
//constructor chaining

//Constructor chaining is the process of calling one constructor from another constructor with respect to current object. 