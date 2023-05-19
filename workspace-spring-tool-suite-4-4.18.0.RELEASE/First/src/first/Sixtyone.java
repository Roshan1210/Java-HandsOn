package first;//Enums---->combination of class and interface combination features


enum Fruits{
	APPLE,MANGO,BANANA,GRAPES,ORANGES;
}
public class Sixtyone {
public static void main(String [] args) {
	Fruits f=Fruits.APPLE;
	System.out.println(f);
	
	
	Fruits arr[]=Fruits.values();
	
	for(Fruits f1:arr) {
		System.out.println(f1);
	}
	
}
}
