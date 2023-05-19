package first;//custom exceptions(using throw keyword)


@SuppressWarnings("serial")
class CustomException extends Exception{

	public CustomException(String s){
		super(s);
	}
	
}
public class Fiftythree {
public static void main(String [] args) {
	try {
		throw new CustomException("Some error occured ");
	}
	catch(CustomException e) {
		System.out.println("Exception caught");
		e.printStackTrace();
	}
}
}
