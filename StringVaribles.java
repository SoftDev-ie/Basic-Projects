import java.util.Scanner;

public class StringVaribles {
		public static void main (String[]args) throws InterruptedException {
		Scanner user_input = new Scanner(System.in);
		String first_name;
		System.out.print("Enter your First name:");
		first_name = user_input.next();
		String family_name;
		Thread.sleep(10000);
		System.out.print("Enter your Family name:");
		family_name = user_input.next();
		String full_name;
		full_name = first_name + " " + family_name;
		System.out.println(full_name);
		}

}
