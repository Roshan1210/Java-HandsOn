package first;//using throws keyword

import java.io.IOException;

//The Java throws keyword is used to declare an exception. It gives an information to the 
//programmer that there may occur an exception. 
//Exception Handling is mainly used to handle the checked exceptions. 
//If there occurs any unchecked exception such as NullPointerException, 
//it is programmers' fault that he is not checking the code before it being used.


class New{
	void yell() throws IOException{
		throw new IOException("Error occurred");
	}
}
public class Fiftyfour {
public static void main(String [] args) {
	New n=new New();
	try{
		n.yell();
	}
	catch(IOException e) {
		System.out.println("Caught exception");
		e.printStackTrace();
	}
}
}
