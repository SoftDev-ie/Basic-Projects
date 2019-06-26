package operations1;

import java.util.Scanner;

class Tenary {
	
	
	public static void main( String args[]){
		int input;
		Tenary t= new Tenary();
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter a number");
	    input = user_input.nextInt();
	    
	    user_input.close();
		
	    t.test(input);
		t.method2(input);
		
		System.out.println("Finished");
	}
	
	public void test(int c){
		 if(c<60)
		    { System.out.println("you fail - IF"); }
		    
		    else 
		    { System.out.println("you pass -IF"); }
		
	}
	public void method2(int c){
		String result =c<60 ? "you fail":"you pass";
		System.out.println(result);
	}
	}
