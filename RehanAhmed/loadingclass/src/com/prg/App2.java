package com.prg;
//import com.cetpa.AA;
public class App2 //extends AA
{
	public static void main(String[] args) {
		try {
			Class.forName("com.cetpa.AA");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
