import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;
public class Search_record {
public static void main(String[] args) {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10","root","Abhi12@x");
		
		String query="select * from employeeid where eid=?";
		PreparedStatement ps=cn.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int eid=sc.nextInt();
		ps.setInt(1,eid);
		ResultSet rst=ps.executeQuery();
		if(rst.next())
		{
			System.out.println("employee id:"+rst.getInt(1));
			System.out.println("employee name:"+rst.getString(2));
			System.out.println("employee department:"+rst.getString(3));
			System.out.println("employee salary:"+rst.getInt(4));
		}
		else
		{
			System.out.println("record not found");
		}
		
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
}
}
