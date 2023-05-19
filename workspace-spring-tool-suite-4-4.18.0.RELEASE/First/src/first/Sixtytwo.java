package first;//Var-args(can be used for primitive as well as reference type

public class Sixtytwo {
	static void dostuff(int... x) {
		System.out.println("var-args");
	}
public static void main(String... args) {
	dostuff();
	dostuff(1);
	dostuff(1,2);
	dostuff(1,2,3);
	int[] ints= {1,2,3,4};
	dostuff(ints);
	
}
}
