package first;

interface Kavita{
	public void kav();
	
}
interface Suman{
	public void suma();
}
interface Satyam extends Kavita,Suman{
	public void saty();
}
abstract class Ritika implements Satyam {
	
	abstract public void riti();
	public void kav() {
		System.out.println("Hey hiii its kavita");
	}
	
}
class Ro extends Ritika{
	
	public void suma() {
		System.out.println("Hey hiii its suman");
	}
	public void saty() {
		System.out.println("Hey hiii its satyam");
	}
	public void riti() {
		System.out.println("Hey hiii its ritika");
	}
}
public class Fiftyone {
	public static void main(String [] args) {
		Ro r=new Ro();
		r.riti();
		r.kav();
		r.saty();
		r.suma();
	}
}
