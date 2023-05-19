package first;
import java.util.*;//Custom ordering/sorting(it is multiple sorting criteria)

class AcademyComparator implements Comparator<Academy>{
	public int compare(Academy a1,Academy a2) {
		//return a1.name.compareTo(a2.name);//as name is string so we used compareTo method
		if(a1.rank<a2.rank) {
			return -1;
		}
		else if(a1.rank==a2.rank) {
			return 0;
		}
		else {
			return 1;
		}
	}
}

class Academy{
	int rank;
	String name;
	String city;
	public Academy(int rank, String name, String city) {
		this.rank = rank;
		this.name = name;
		this.city = city;
	}
	
	public String toString() {
		return rank+" "+name+" "+city;
	}
}
public class Seventy {
public static void main(String[] args) {
	List<Academy> l=new ArrayList<Academy>();
	Academy a1=new Academy(23,"creative","baramati");
	Academy a2=new Academy(12,"chaitanya","Phaltan");
	Academy a3=new Academy(45,"Dyanjot","MIDC");
	l.add(a1);
	l.add(a2);
	l.add(a3);
	System.out.println(l);//[23 creative baramati, 12 chaitanya Phaltan, 45 Dyanjot MIDC]
	Collections.sort(l,new AcademyComparator());
	System.out.println(l);//[12 chaitanya Phaltan, 23 creative baramati, 45 Dyanjot MIDC]

	
}
}
