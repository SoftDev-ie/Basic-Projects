package operations1;
import java.util.Scanner;

public class PowerofTwo {
	int input;
	
	public static void main(String[] args) {
		PowerofTwo t= new PowerofTwo();
		t.input();
	}
	
	
public void input(){
		
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter the  number to test");
		input = user_input.nextInt();
		 
		method();
		
		user_input.close();
		}

public void method(){
	
	if((input & (input - 1)) == 0){
		System.out.println("this is to the pow of 2");
	}
	else{
		System.out.println("this is not to the pow of 2");
					}
		}
}
