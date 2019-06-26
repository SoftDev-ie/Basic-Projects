package databaseconnection;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;




	public class ConnectionMySQL 
	{
		static ArrayList Entries = new ArrayList();
		
	public static void main (String[] args)throws IOException
	{
	writeToDatabase();
	readFromDatabase();
	writeFile();
	}
	public static void readFromDatabase() // reads entries from a database
	{
		Connection com = null;
		try{
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/employee","root","");
			System.out.println("connection success");
			String query = "SELECT * FROM emp";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				
				System.out.println("Employee ID : " + rs.getString("E_ID") + " Name : "+ rs.getString("name")+" Role : "+ rs.getString("job"));
				Entries.add("Employee ID : " + rs.getString("E_ID") + " Name : "+ rs.getString("name")+" Role : "+ rs.getString("job"));
			}
		}catch (Exception e){
			System.err.println(e);
		}
	}
	
	public static void writeFile() throws IOException //Writes the table to a text file
	{
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
		for(Object OBG : Entries)
		out.println(OBG);
		
		out.close();
	}
	public static void writeToDatabase()  //Writes an entry to a MySQL database using java
	{
		try
	    {
	     
	     
	      String myUrl = "jdbc:mysql://localhost/employee";
	      
	      Connection conn = DriverManager.getConnection(myUrl, "root", "");
	       
	      Statement st = conn.createStatement();
	 
	      st.executeUpdate("INSERT INTO emp(E_ID,name,job,manager,Hire_Date,e_Sal,Commission,Dept_no)"
	          +"VALUES ('0680','Barney','stonecutter','7902','19801217','800','100','20')");
	 
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	 
	  }
}

