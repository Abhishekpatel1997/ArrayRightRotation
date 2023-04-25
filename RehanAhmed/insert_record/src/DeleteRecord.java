import java.sql.*;
import java.util.Scanner;
public class DeleteRecord {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10","root","Abhi12@x");
		String query="delete from employeeid where eid=?";
		PreparedStatement ps=cn.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee id:");
		int eid=sc.nextInt();
		ps.setInt(1, eid);
		int n=ps.executeUpdate();
		if(n>=1)
		{
			System.out.println("Record deleted");
		}
		else
		{
			System.out.println("Record does not exits");
		}
		
	} 
	catch(Exception ex)
	{
		System.out.println(ex);
	}
}
}
