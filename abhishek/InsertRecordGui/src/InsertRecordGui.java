
//public class InsertRecordGui {

//	package com.demo;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
import java.sql.*;
	public class InsertRecordGui {
	JFrame fr=new JFrame("Insert record");
	JLabel []la=new JLabel[4];
	JTextField []tb=new JTextField[4];
	JButton save=new JButton("save Record");
	public InsertRecordGui()
	{
		fr.setSize(400,500);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponents();
		fr.setLayout(null);
		fr.setVisible(true);
	}
	private void addComponents()
	{
		String []str= {"id","name","department","salary"};
		Font fo=new Font("arial",Font.PLAIN,30);
		int y=30;
		for(int i=0;i<=3;i++)
		{
			la[i]=new JLabel("Enter Employee"+str[i]);
			la[i].setBounds(30,y,140,30);
			la[i].setFont(fo);
			fr.add(la[i]);
			tb[i]=new JTextField();
			tb[i].setBounds(180,y,190,30);
			tb[i].setFont(fo);
			fr.add(tb[i]);
			y+=70;
		}
		save.setBounds(170,320,150,30);
		fr.add(save);
	}
	class SaveListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
		public static void main(String[] args) {
			new InsertRecordGui();

		}

	}

