import java.sql.*;
import java.util.Scanner;
public class InsertRecord2 {
public static void main(String[] args) {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10","root","Abhi12@x");
		String query="insert into employeeid values(?,?,?,?)";
		PreparedStatement ps=cn.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");
		int eid=Integer.parseInt(sc.nextLine());
		ps.setInt(1,eid);
	System.out.println("Enter employee name:");
	String name=sc.nextLine();
		ps.setString(2,name);
		System.out.println("Enter employee department:");
		String dept=sc.nextLine();
		ps.setString(3,dept);
		System.out.println("enter employee salary");
		int sal=Integer.parseInt(sc.nextLine());
		ps.setInt(4,sal);
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
