package first;//instance /non-static initializer block(called for each instance created)

public class Thirtyeight {
static int i;
int j;
{
	System.out.println("first instance initializer block called");
}
{
	System.out.println("Second instance initializer block called");
}
Thirtyeight(){
	j=5;
	System.out.println("constructor called");
}
static {
	i=10;
	System.out.println("static  initializer block called");//called once once at start
}
public static void main(String[] args) {
	Thirtyeight t1=new Thirtyeight();
	Thirtyeight t2=new Thirtyeight();//diff between constructor and IIB is IIB is called each time after obeject creation ,
	//so if we want to repaeat a code for every object than just write it once in IIB.
	
}
}
