package operations1;
import java.util.Scanner;

public class EmployeeCalculates {
	
	public static void main(String args[])
	{
		EmployeeCalculates t = new EmployeeCalculates ();
		t.input();	
		
	}
	
	void input(){
		float sales_value =0;
		int units_sold =0;
		short units_assembled =0;
		double bonus =0;
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("enter your department number - enter 1,2 or 3");
		int department = user_input.nextInt();
		
		 switch (department)
		    { 
					 
			 case 1:bonus = department1(sales_value); break;
			
			 case 2:bonus = department2(units_sold); break;
			 
			 case 3:bonus = department3(units_assembled); break;
			}
		 System.out.println("your Bonus is:€ " + bonus);
		 user_input.close();
		 
		}
	
	float department1(float x)
		{
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("How much in total was the value of your sales");
		float sale_value = user_input.nextFloat();
		x=getBonus(sale_value);
		return x;
		}
	
	double department2(int x)
		{
		Scanner user_input = new Scanner(System.in);
		System.out.print("how many units did you sell");
		int units_sold = user_input.nextInt();
		x=getBonus(units_sold);
		return x;
		
		}
	
	double department3(short x)
		{
		
		boolean full_time = false;
		Scanner user_input = new Scanner(System.in);
		System.out.print("are you full time or part time? - type FULL or PART");
		String position = user_input.next().toLowerCase();
		
		if(position.equals("full"))
			full_time = true;
		else
			full_time = false;
		System.out.println(full_time);
		double bonus = getBonus(full_time);
		return bonus;
		}
		
	float getBonus(float x)
		{
			float y;
			if(x >5000.0f)
				y = 0.05f *x;
			else
				y=0f;
		return y;
		}

	int getBonus(int x)
		{
			int y =0;
			if(x > 0)
			{
				y = 100;
				if(x>25)
					y += (50*(x-25));
				
			}
			return y;
		}

	double getBonus(boolean x)
		{
			double bonus = 0;
			Scanner user_input = new Scanner(System.in);
			System.out.print("how many units did you assemble?");
			int units_assembled = user_input.nextInt();
		
			if(x == false)
				if(units_assembled > 250)
					bonus = units_assembled * 0.10F;
						
			if(x==true)
				if(units_assembled > 700)
					bonus = units_assembled * 0.10F;
			return bonus;
		}
}
