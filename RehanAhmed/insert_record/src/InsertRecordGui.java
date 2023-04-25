import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class InsertRecordGui {
 JFrame fr=new JFrame("Insert Record");
 JLabel []la=new JLabel[4];
 JTextField []tb=new JTextField[4];
 JButton save=new JButton("Save record");
 PreparedStatement ps;
 public InsertRecordGui()
 {
	 fr.setSize(400,500);
	  fr.setLocationRelativeTo(null);
	  fr.setResizable(false);
	  fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  fr.setLayout(null);
	  addComponents();
	  dbConnection();
	  fr.setVisible(true);
 }
 private void dbConnection()
 {
	 try
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10","root","Abhi12@x");
			String query="insert into employeeid values(?,?,?,?)";
			ps=cn.prepareStatement(query); 
	 }
	 catch(Exception ec)
	 {
		 System.out.println(ec);
	 }
 }
 public void addComponents()
 {
	 String []str= {"id","name","department","salary"};
	 int y=50;
	 Font fo=new Font("arial",Font.PLAIN,20);
	 for(int i=0;i<4;i++)
	 {
		 la[i]=new JLabel("enter employee"+str[i]);
		 la[i].setBounds(30,y,140,30);
		 la[i].setFont(fo);
		 fr.add(la[i]);
		 tb[i]=new JTextField();
		 tb[i].setBounds(180,y,190,30);
		 tb[i].setFont(fo);
		 fr.add(tb[i]);
		 y+=70;
		
	 }
	 save.setBounds(170,320,130,30);
	 fr.add(save);
	 save.addActionListener(new SaveListener());
	 }
 class SaveListener implements ActionListener
 {
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
						
			int eid=Integer.parseInt(tb[0].getText());
			ps.setInt(1,eid);
		
		String name=tb[1].getText();
			ps.setString(2,name);
			
			String dept=tb[2].getText();
			ps.setString(3,dept);
			int sal=Integer.parseInt(tb[3].getText());
			ps.setInt(4,sal);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(fr,"Record Insserted"); 
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
 } 
	public static void main(String[] args) {
		
new InsertRecordGui();

	}
 }
