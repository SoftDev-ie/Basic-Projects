package databaseconnection;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class GuiForInputting {
	static String databasename;
	static String tablename;
	
	
		static ArrayList Entries = new ArrayList();
			
		public static void main (String[] args)throws IOException
		{
		pickDatabase();
		
		readFromDatabase();
		
		}
		public static void pickDatabase()
		{
			JFrame frame = new JFrame();
			databasename = JOptionPane.showInputDialog(frame, "Enter your database name?");
			tablename = JOptionPane.showInputDialog(frame, "Enter your table name?");
			
		}
		public static void readFromDatabase() // reads entries from a database
		{
			
			Connection com = null;
			try{
				Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/"+databasename,"root","");
				System.out.println("connection success");
				String query = "SELECT * FROM "+tablename;
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				int count = rsmd.getColumnCount();
				
				String columnName[] = new String[count];
								
				for (int i = 1; i <= count; i++){
					columnName[i-1] = rsmd.getColumnLabel(i);
				}
				for(String A :columnName)
					System.out.println(A);
				}catch (Exception e){
				System.err.println(e);
			}
			
		}
	
}

