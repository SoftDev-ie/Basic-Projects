package databaseconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;

//CREATES A MYSQL TABLE IN A DATABASE CALLED JAVA
public class GuiForSQL {
	static String tablename;
	static int count;
	static int i;
	
	public static void main(String[] args) throws Exception
	{
		createTable();
	}
	 public static void createTable()throws Exception{
		Connection com = null;
		JFrame frame = new JFrame();
		
		try{
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/JAVA","root","");
			System.out.println("connection success");
			
			Statement stmt = conn.createStatement();
			
		//CREATES TABLE WITH A TEMP COLUMN WITH CHOSEN NAME
		tablename = JOptionPane.showInputDialog(frame, "What's your table name?");
		String sqlQuery = "CREATE TABLE "+tablename+"(temp VARCHAR(4))";
		
		stmt.executeUpdate(sqlQuery);
		
			}
		
			catch (Exception e)
			{
			System.err.println(e);
			}
		
		count =Integer.parseInt(JOptionPane.showInputDialog(frame, "how many columns will the table have?"));
		
		
		
		for(i = 1; i <=count; i++)
			{
				createColumns();
			}
		
		// REMOVES TEMP COLUMN WHICH WAS NEEDED TO CREATE THE TABLE
		String sqlQuery2 ="ALTER TABLE "+tablename+" DROP COLUMN TEMP";
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/JAVA","root","");
		Statement stmt2 = conn.createStatement();
		stmt2.executeUpdate(sqlQuery2);
		
		JOptionPane.showMessageDialog(frame,"SUCCESS","TABLE CREATED",JOptionPane.PLAIN_MESSAGE);
		}
	 
	 public static void createColumns()throws Exception{
		 JFrame frame = new JFrame();
		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/JAVA","root","");
			System.out.println("connection success");
			Statement stmt2 = conn.createStatement();
			String temp = JOptionPane.showInputDialog(frame, "What is the name of column " +i);
			String temp2 = JOptionPane.showInputDialog(frame, "What type of data is stored in column " +i + " Type VARCHAR or INT");
			int temp3 =Integer.parseInt(JOptionPane.showInputDialog(frame, "What size is column " +i));
			
			String query = "ALTER TABLE "+tablename+" ADD COLUMN "+temp+" "+temp2+" "+"("+temp3+")";
			stmt2.executeUpdate(query);
		}
}
