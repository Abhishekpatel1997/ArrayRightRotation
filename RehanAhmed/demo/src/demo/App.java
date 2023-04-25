package demo;
import java.sql.*;
//import com.mysql.cj.jdbc.Driver;
public class App {

	public static void main(String[] args) {
try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10","root","Abhi12@x"))
{//Database connetionc code
	Class.forName("com.mysql.cj.jdbc.Driver");  //to load jdbc driver implementation
	
	System.out.println("Connected....");
	//code to execute sql query
	Statement st=cn.createStatement();
	String query="create table if not exists customers12(pid int auto_increment primary key,name varchar(20))";
	
	st.execute(query); 
	System.out.println("Table is created.... ");
	
}
catch(Exception ex)
{
	System.out.println(ex);
}
		
		
	}

}
