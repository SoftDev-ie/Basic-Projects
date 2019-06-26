package operations1;

import java.util.Scanner;

public class Palindrome {
 
	static String input;
 
	public static void main(String[] args) {
	Palindrome t = new Palindrome ();
		t.output();	
	}
	
	public void output(){
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter the sentence");
		input = user_input.next();
		loop();
		
		user_input.close();
	
	}
	public void loop(){
		int i;
		int a = 1;
		int y=0;
		int c = 0;
		
		for (i=input.length();i!=0;i--){
			
			int b = input.length() -a;
			
			
			char d = input.charAt(b);   //starts at end char of string
			char e = input.charAt(c);   //starts at start char of string
			
			if(e==d){
			y++;
			}
			
			if(y == input.length()){
				System.out.println("it is a palindrome");
				
			}
			
			a++;
			c++;
		}
		if(y != input.length()){
			System.out.println("it is not a palindrome");
		}
 	}
}
