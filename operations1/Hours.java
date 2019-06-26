package operations1;

import java.util.Scanner;

public class Hours {

	public static void main( String args[]){
		int input;
		Hours t= new Hours();
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter the time in hours");
	    input = user_input.nextInt();
	    
	    user_input.close();
		
	    t.test(input);
		
		System.out.println("Finished");
	}
	
	public void test(int c){
		int seconds;
	
		if( c > 0)
	    { seconds = ((c*60)*60);
	    System.out.println("The time in seconds is " + seconds);
	    }
	    
	    else 
	    { System.out.println("please enter a positive hour"); 
	    }
	}
}
