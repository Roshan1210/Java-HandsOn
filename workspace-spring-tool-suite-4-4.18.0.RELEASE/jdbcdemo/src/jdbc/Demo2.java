package jdbc;
//jdbc demo
import java.sql.*;
public class Demo2 {
	private static Connection cn=null;
	public static Connection fetchConnection() throws SQLException{
		if(cn==null) {
			String val="jdbc:mysql://localhost:3306/Anjali";
			cn=DriverManager.getConnection(val, "root", "manager");
		}
		return cn;
	}
public static void main(String [] args) {
	try{
		Connection cn=Demo2.fetchConnection();
		String sql="INSERT INTO roshan VALUES (?,?,?)";
		PreparedStatement st=cn.prepareStatement(sql);
		st.setInt(1, 29);
		st.setString(2, "ritika");
		st.setDouble(3, 90.8);
		
		int i=st.executeUpdate();
		System.out.println(i+" records inserted");
//		ResultSet rst=st.executeQuery();
//			
//		while(rst.next()) {
//			System.out.println(rst.getInt("id")+" "+rst.getString("name")+" "+rst.getDouble("marks"));
//		}
		cn.close();
//		rst.close();
		st.close();
	}
	
	catch(Exception e) {
		
	}
	
	
}
}