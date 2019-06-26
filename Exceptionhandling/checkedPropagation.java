package Exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class checkedPropagation {
			
		public static void main(String[] args)	throws IOException
		{
			callmethod();
		
		}
		
		public static void inOutException() throws IOException
		{
			  
			PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
			out.println("This file was created");
			out.println("by a pizard");
			out.close();
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(2);
			list.add(2);
			list.add(2);
			
			for (int i = 0; i <list.size(); i++) 
			{
	             
				System.out.println("Value at: " + i + " = " + (list.get(i))); 
			}	 
		}
		public static void callmethod()throws IOException{
			try
			{
				inOutException();	
			} catch(IOException ioe) {
				System.err.println("Caught IOException");

	        }
		}
}