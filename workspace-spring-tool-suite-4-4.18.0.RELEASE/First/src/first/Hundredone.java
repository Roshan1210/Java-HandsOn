package first;
import java.io.*;
import java.util.*;
//I/O handling
//Java brings various Streams with its I/O package that helps the user to
//perform all the input-output operations. These streams support all the types 
//of objects, data-types, characters, files etc to fully execute the I/O operations.
//Streams in java1)System.in(keyboard),2)System.out(screen),3)System.err(screen)
//Types of Streams:
//
//Depending on the type of operations, streams can be divided into two primary classes:
//Input Stream: These streams are used to read data that must be taken as an input from a 
//source array or file or any peripheral device. For eg., FileInputStream, BufferedInputStream, ByteArrayInputStream etc.
//Output Stream: These streams are used to write data as outputs into an array or file or any output peripheral device.
//For eg., FileOutputStream, BufferedOutputStream, ByteArrayOutputStream etc.

//ByteStream: This is used to process data byte by byte (8 bits).
//Though it has many classes, the FileInputStream and the FileOutputStream are the most popular ones.
//The FileInputStream is used to read from the source and
//FileOutputStream is used to write to the destination. Here is the list of various ByteStream Classes:

//Stream class	Description
//BufferedInputStream	It is used for Buffered Input Stream.
//DataInputStream	It contains method for reading java standard datatypes.
//FileInputStream	This is used to reads from a file
//InputStream	This is an abstract class that describes stream input.
//PrintStream	This contains the most used print() and println() method
//BufferedOutputStream	This is used for Buffered Output Stream.
//DataOutputStream	This contains method for writing java standard data types.
//FileOutputStream	This is used to write to a file.
//OutputStream	This is an abstract class that describe stream output.

//CharacterStream: In Java, characters are stored using Unicode conventions 
//(Refer this for details). Character stream automatically allows us to read/write 
//data character by character. Though it has many classes, the
//FileReader and the FileWriter are the most popular ones.
//FileReader and FileWriter are character streams used to read 
//from the source and write to the destination respectively.
//Here is the list of various CharacterStream Classes:
//Stream class	Description
//BufferedReader	It is used to handle buffered input stream.
//FileReader	This is an input stream that reads from file.
//InputStreamReader	This input stream is used to translate byte to character.
//OutputStreamReader	This output stream is used to translate character to byte.
//Reader	This is an abstract class that define character stream input.
//PrintWriter	This contains the most used print() and println() method
//Writer	This is an abstract class that define character stream output.
//BufferedWriter	This is used to handle buffered output stream.
//FileWriter	This is used to output stream that writes to file.

public class Hundredone {
public static void main(String [] args) throws Exception {
	try(Scanner sc=new Scanner(System.in);
			BufferedReader br=new BufferedReader(new FileReader("E:\\RITIKA SHARMA\\roshan.txt"));
			PrintWriter pw=new PrintWriter(new FileWriter("E:\\RITIKA SHARMA\\roshan1.txt",true),true)){
		//JAVA APP<----BR----<FR(text file-Char)
		//reading a file 
		String line =null;
		while((line=br.readLine())!=null)
			System.out.println(line);
		

		System.out.println("File read over");
		br.lines().
		forEach(s->pw.println(s));
		
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}

