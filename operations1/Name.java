package operations1;
import java.util.Scanner;

public class Name {
	static String s1;
	static String s2;
	static String s3;
	
	public static void main( String args[]){
	Name t =new Name();
		t.input();
	}
	
	public void input(){
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter your first name");
		s1 = user_input.next().toLowerCase();
		
		System.out.print("Enter your second name");
		s2 = user_input.next().toLowerCase();
		
		s3 = ("" + s1.charAt(0)+s2.charAt(0));
		
		user_input.close();
		
		
	    	System.out.println("Your Initials are "+s3);
	    	}
	}


