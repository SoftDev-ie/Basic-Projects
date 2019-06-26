package Methods;

import java.util.Scanner;

public class NumberMethod {

	
	static NumberMethod t = new NumberMethod();

	public static void main(String[] args) {
			
		t.input();
		
		}
	
	public void input(){
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("enter a number");	
		int Number = user_input.nextInt();
		
		int x = t.total(Number);
		
		System.out.println(x);
	}
	int total(int aNumber){
		int a_Value = aNumber + 20;
		
		return a_Value;
		
	}
	
}
