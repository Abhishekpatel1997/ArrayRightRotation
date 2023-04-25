import java.sql.*;
public class InsertRecord {
public static void main(String[] args) {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10","root","Abhi12@x");
		String query="insert into employeeid values(?,?,?,?)";
		PreparedStatement ps=cn.prepareStatement(query);
		ps.setInt(1,101);
		ps.setString(2,"Abhishek patel");
		ps.setString(3, "developer");
		ps.setInt(4, 40000);
		ps.executeUpdate();
		System.out.println("Record inserted");
	}
	catch(Exception e)
	{
		System.out.println(e);
		e.printStackTrace();
	}
}
}
