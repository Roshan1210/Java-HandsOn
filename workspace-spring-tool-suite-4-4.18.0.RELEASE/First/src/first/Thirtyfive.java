package first;
import java.util.*;//array of references
public class Thirtyfive {
	int age;
	String name;
	char sex;
	Thirtyfive(int age,String name,char sex){
		this.age=age;
		this.name=name;
		this.sex=sex;
	}
	void display() {
		System.out.println("Age=> "+age+" Name=> "+name+" Sex=> "+sex);
	}
	
	 @Override
	    public String toString()
	    {
	        return this.age + " " + this.name + " " + this.sex;
	    }
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		Thirtyfive[] boxes;
		System.out.println("Enter no. of entries you want ");
		boxes=new Thirtyfive[sc.nextInt()];
		for(int i=0;i<boxes.length;i++) {
			System.out.println("Enter data for "+(i+1));
			boxes[i]=new Thirtyfive(sc.nextInt(),sc.next(),sc.next().charAt(0));
		}
		
		System.out.println();
		for(int i=0;i<boxes.length;i++) {
			boxes[i].display();
		}
		System.out.println();
		
		for(Thirtyfive b:boxes) {
			b.display();
		}
		
		System.out.println(Arrays.toString(boxes));//overriding tostring method
		
		sc.close();
		
	}

}
