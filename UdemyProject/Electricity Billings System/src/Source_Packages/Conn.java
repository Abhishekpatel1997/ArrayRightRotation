package Source_Packages;
import java.sql.*;
public class Conn {
	Connection c;
	Statement s;
	public Conn()
	{
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","Abhi12@x");
		 s=c.createStatement();
		System.out.println("Connected;....");
//		st.execute(null);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		new Conn();
	}
}

