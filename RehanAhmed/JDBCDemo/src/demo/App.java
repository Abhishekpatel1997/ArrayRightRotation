package demo;
import java.sql.*;

public class App {
public static void main(String[] args) {
	try
	{
		
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","Abhi12@x");
		System.out.println("connected..");
		Statement st=cn.createStatement();
		String query="create table patel(id int,name varchar(20))";
		st.execute(query);
		System.out.println("table is created");
		
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
}
}
