package Exceptionhandling;
import java.io.*;
import java.io.FileWriter;

public class Test {
public static void main(String args[]){
	FileInputStream fis = null;
	try
	{
		fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\java\\file.txt");
		System.out.println("File Opened");
		fis.read();
		System.out.println("Read file");
	
	}
		catch(FileNotFoundException fnfe)
		{
		System.out.println("File Not Found");
		}	
		catch(IOException ioe)
		{
			System.out.println("File Closing Exception");
			
		}
		finally
			{
			System.out.println("finally");
			}
		System.out.println("Next task.");
	}
}


