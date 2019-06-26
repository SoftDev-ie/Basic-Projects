package operations1;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersList {
		int count = 0;
						
			static NumbersList t = new NumbersList();
		
			static ArrayList<Integer> numbers = new ArrayList<Integer>();
		
			public static void main(String[] args) {
					
				t.input();
				t.average();
				t.highest();
				t.lowest();
				t.even();
				
				}
			
			public void input(){
				
				Scanner user_input = new Scanner(System.in);
				
				System.out.print("enter a number");	
				String temp =null;
			
			
			while (!(temp = user_input.nextLine()).isEmpty()){
				System.out.print("enter a number");	
				int number = Integer.parseInt(temp);
				numbers.add (number);
				count++;
			}
			System.out.println(numbers);
			user_input.close();
			}
			
			public void average()
			{
				int total = 0;
				for(int i=0; i<numbers.size(); i++){
					
					total = total + numbers.get(i);
				}
				int average = total/count;
				System.out.println("the average is " + average);
			}
			
			public void highest()
			{
				
				int temp = numbers.get(0);
				
				for(int i=0; i<numbers.size(); i++)
				{
					
					if(numbers.get(i)>temp)
					{
						temp =numbers.get(i);
					}
				}
			
				System.out.println("the highest is " + temp);
			}
			
			public void lowest()
			{
				
				int temp = numbers.get(0);
				
				for(int i=0; i<numbers.size(); i++)
				{
					
					if(numbers.get(i)<temp)
					{
						temp =numbers.get(i);
					}
				}
			
				System.out.println("the lowest is " + temp);
			}
			public void even()
				{
				
				int temp = numbers.get(0);
				
				for(int i=0; i<numbers.size(); i++)
					{
					
					if((numbers.get(i) % 2) == 0)
						{
						numbers.remove(i);
						}
			
					}
				System.out.println("the list without even numbers is " +numbers);
				}
}
