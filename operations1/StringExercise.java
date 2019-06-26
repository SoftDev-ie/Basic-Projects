package operations1;
import java.util.Scanner;

public class StringExercise {
	static String input;
	static String input2;
	
	public static void main(String[] args) {

		StringExercise t = new StringExercise ();
			t.input();	
		}
		
		
		public void input(){
			int choice;
			
			Scanner user_input = new Scanner(System.in);
			
			System.out.println("Enter the  first sentence");
			input = user_input.nextLine();

			System.out.println("Enter the  second sentence");
			input2 = user_input.nextLine();
			
			System.out.println("please select your option");
			choice = user_input.nextInt();
			switch (choice)
		    { 
					 
			 case 1:compare();break;
			
			 case 2:Lastaccurance(); break;
									 
			 case 3:removeChar() ; break;
			
		}
			
			user_input.close();
}
		
		public void compare(){
			if(input.equals(input2)){
				System.out.println("The Strings are equal");
			}
			else {
				System.out.println("The Strings are not equal");
			}
			
		}
		
		public void Lastaccurance(){
			String input3;
			int choice;
			
					
			Scanner user_input2 = new Scanner(System.in);
			System.out.print("Enter the  substring you wish to find");
			input3 = user_input2.next();
			System.out.print("Enter the  string you wish to search - 1 or 2");
			choice = user_input2.nextInt();
						
			
			switch (choice)
		    { 
					 
			 case 1:int a = input.lastIndexOf(input3); System.out.print(a);break;
			
			 case 2: int b = input2.lastIndexOf(input3);System.out.print(b); break;
									 
			 default: System.out.println("enter 1 or 2");Lastaccurance(); break;
			
		}
			
		}
		
		public void removeChar(){
			char a;
			
			int choice;
			
			Scanner user_input3 = new Scanner(System.in);
			System.out.print("Enter the  string you wish to change - 1 or 2");
			choice = user_input3.nextInt();
			System.out.print("Enter the character you wish to remove");
			a = user_input3.next().charAt(0);
			
			if(choice ==1){
				
			char[] ar =input.toCharArray();
				for (int i = 0; i<input.length();i++){
					if(input.charAt(i) != a){
						input += ar[i];
					}
				}
			}
			else if(choice ==2){
			char[] arr =input2.toCharArray();
			for (int i = 0; i<input.length();i++){
				if(input2.charAt(i) != a){
					input2 += arr[i];
				}
			}
			}						 
			else{
			System.out.println("enter 1 or 2");Lastaccurance();
			
		}
}
		public void replace(){
			
		}
}


