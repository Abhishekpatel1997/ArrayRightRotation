package demo;
import java.sql.*;
//import com.mysql.cj.jdbc.Driver;
public class App {

	public static void main(String[] args) {
try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Abhi12@x"))
{//Database connetionc code
	Class.forName("com.mysql.cj.jdbc.Driver");  //to load jdbc driver implementation
	
	Statement st=cn.createStatement();
	st.execute("create databaseif not exists cetpainfotech");
	cn.close();
	System.out.println("database is created");
	
}
catch(Exception ex)
{
	System.out.println(ex);
}
		
		
	}

}
