package Arrays;
import java.util.Scanner;


public class PassingArray {
	public static void main (String [] args)
		{
		PassingArray t = new PassingArray();
		int[] num = null;	

		
		num =t.input(num);	
		
		showNum(num);
		
		}
		
		public static void showNum(int[] num)
		{
			
			for(int i=0; i<num.length; i++)
			{
			System.out.print(num[i]);
			}
		}

		public int[] input(int[] num){
				
			Scanner user_input = new Scanner(System.in);
	
			System.out.println("enter the amount of numbers you will enter");
			int size = user_input.nextInt();
			num = new int[size];	
			fill(num);
							
			user_input.close();
			return num;
			}

		static public void fill(int[] num){
		Scanner user_input = new Scanner(System.in);			
			
			System.out.println("enter a number");
			String number1 = user_input.nextLine();

					
			int i =0;
			do					
			
				{
				System.out.println("enter a number");
		        
						int number2 = Integer.parseInt(number1);
						num[i] = number2;
						

				}
			while (i++<num.length - 1 && (!(number1=user_input.nextLine()).isEmpty()));
			}
}
			

