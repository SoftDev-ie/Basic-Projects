package operations1;

import java.util.Scanner;

class PositiveNegative {
	
	
	public static void main( String args[]){
		int input;
		PositiveNegative t= new PositiveNegative();
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter a number");
	    input = user_input.nextInt();
	    
	    user_input.close();
		
	    t.test(input);
		
		System.out.println("Finished");
	}
	
	public void test(int c){
		 if( c > 0)
		    { System.out.println("Number is positive"); }
		    
		    else 
		    { System.out.println("Number is negative"); }

		
	}
}
