import java.sql.*;

public class Select_Record {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10", "root", "Abhi12@x");
			Statement st = cn.createStatement();
			String query = "select * from employeeid";
			ResultSet rst = st.executeQuery(query);
			while (rst.next()) {
				rst.next();// cursor will be at first record
				System.out.println(rst.getInt(1) + "," + rst.getString(2) + "," + rst.getString(3) + "," + rst.getString(4));

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
