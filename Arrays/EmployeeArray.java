package Arrays;
import java.util.Scanner;
public class EmployeeArray {
	
		int input;
		String name;
		String hours;
		String employee [][];
		 
		public static void main(String[] args) {
			EmployeeArray t= new EmployeeArray();
			t.input();
		}
		
		
	public void input(){
			
			
			Scanner user_input = new Scanner(System.in);
			
			System.out.println("enter the amount of employees");
			input = user_input.nextInt();
			
			employee = new String [input][1];
			
			
			method();
			
			user_input.close();
			}

	public void method(){
		Scanner user_input = new Scanner(System.in);
		
		for(int i=0;i < input; i ++){
			
			for(int x =0; x <1; x++){
				 
				System.out.println("enter the employees name");
				name = user_input.next();
				
				System.out.println("enter the employees hours");
				hours = user_input.next();
				
				employee[i][x] = name+" "+hours;
				
		
			}
	}
		user_input.close();
			for(int i=0;i < input; i ++){
				for(int x =0; x < 1; x++){
					System.out.print(employee[i][x] + "\n");
			}
	}
}
}
