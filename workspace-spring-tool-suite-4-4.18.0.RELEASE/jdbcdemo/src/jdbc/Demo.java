package jdbc;
//jdbc demo
import java.sql.*;
public class Demo {
	private static Connection cn=null;
	public static Connection fetchConnection() throws SQLException{
		if(cn==null) {
			String val="jdbc:mysql://localhost:3306/Anjali";
			cn=DriverManager.getConnection(val, "root", "manager");
		}
		return cn;
	}
public static void main(String [] args) {
	try(Connection cn=Demo.fetchConnection();
		Statement st=cn.createStatement();
		ResultSet rst=st.executeQuery("SELECT * from roshan");
			){
		while(rst.next()) {
			System.out.println(rst.getInt("id")+" "+rst.getString("name")+" "+rst.getDouble("marks"));
		}
	}
	
	catch(Exception e) {
		
	}
	
	//Software architecture refers to the basic structure of any software system and incorporates any aspect that makes
//	a system function and behaves as it should. Although the term architecture usually refers to physical designs,
//	in software systems, it encompasses the design of components, relationships between components, user interactions,
//	as as well as the user’s needs of a system.
	
//	Layered architectures are said to be the most common and widely used architectural framework in software development.
//	It is also known as an n-tier architecture and describes an architectural pattern composed of several separate horizontal 
//	layers that function together as a single unit of software. A layer is a logical separation of components or code:
	
	
	//In these frameworks, components that are related or that are similar are usually placed on the same layers. However, 
//	each layer is different and contributes to a different part of the overall system.
	
	//Another characteristic is the concept of layers of isolation. This means that layers can be modified and the change won’t affect other layers. In short, changes are isolated to the specific layer that is altered.

//Separation of concerns is another notable feature that speaks to how the modules on a single layer together perform a single function.
	
//Presentation Layer – responsible for user interactions with the software system
//	Application/Business Layer – handles aspects related to accomplishing functional requirements
//	Domain Layer – responsible for algorithms, and programming components
//	Infrastructure/Persistence/Database Layer – responsible for handling data, databases
	
	
}
}
