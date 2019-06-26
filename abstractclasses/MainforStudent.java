package abstractclasses;

import java.util.Scanner;

public class MainforStudent {
	static String name;
	static int type;
	static double average;
	
	public static void main(String args[]){
		//coding in terms of abstract class
		
		
		Student programmerI = new ProgrammerType(name,type,average);
		Student programmerII = new ProgrammerType(name,type,average);
		programmerI.input();
		programmerI.display();
	}
		
}

