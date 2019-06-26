package operations1;
import java.util.Scanner;

class Book {
	static String Title; 
	static String Author; 
	int yearpublished; 
	int Pages;
	char CoverType;
	
	public void setyear(int year){
		yearpublished = year;
	}
	public void setpages(int page){
		Pages = page;
	}
	public void setcover(String A){
		char B = A.charAt(0);
		CoverType = B;
	}
	}


public class Test {
		
	public static void main(String[] args) {
	Book t= new Book();
				
			Scanner user_input = new Scanner(System.in);
			
			System.out.print("Enter your books title");
			Book.Title = user_input.next();
			System.out.print("Enter your books Author");
			Book.Author = user_input.next();
			
			System.out.print("Enter year published");
			int input = user_input.nextInt();
			t.setyear(input);
			
			System.out.print("Enter amount of pages");
			int input2 = user_input.nextInt();
			t.setpages(input2);
			
			System.out.print("set cover type please");
			String input3 = user_input.next();
			t.setcover(input3);
			
			user_input.close();
			
		    System.out.println("Author: "+ Book.Author);
			System.out.println("Year: "+ t.yearpublished);
			System.out.println("Pages: "+ t.Pages);
			System.out.println("Cover: "+ t.CoverType);
			}
}


