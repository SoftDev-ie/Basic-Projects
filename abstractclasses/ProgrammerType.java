package abstractclasses;

import java.util.Scanner;

public class ProgrammerType extends Student
{
	int i;
		
		public ProgrammerType(String nm, int type,double average)
		{
			super(nm,type,average);
			//this.average = average;
		}
		public void grades()
		{
			
			if(average >= 90){
				 i=1;
			    }
			    else if (average >= 80)	
			    { 
			    	i=2;}
			    else if (average >= 60){
			    	i=3;}
			    else
			    { 
			    	i=4;  
			    }
			    
			switch (i)
		    {				 
			 case 1: System.out.println("congratulations your average grade is A");  break;
			 
			 case 2:System.out.println("congratulations your average grade is B");  break;
			 
			 case 3:System.out.println("congratulations your average grade is D");  break;
			 			 
			 default: {System.out.println("you complete failure, your average grade is F");}
		    }
		}
		public void awards()
		{
			if(i==1)
				System.out.println("Award given for high grade student");
			else
				System.out.println("you didnt get an award");
			
		}
		public double averages()
		{
						
				Scanner user_input = new Scanner(System.in);
				System.out.print("Enter number ofgrades");
			    int loop = user_input.nextInt();
			    
			    int a=0;
			    int b=0;
				double c = 0;
				int i=0;
				
				while (i<loop)
				{
					System.out.print("Enter number");
				    int input2 = user_input.nextInt();
			
			b = (b+=input2);
			i++;
			
				}
				c=(double)b/loop;
				user_input.close();
				
				return c;
			}

		public void display(){
			System.out.println("hello " + Student.name);
			if(type==1)
				System.out.println("Programmer I! ");
			else System.out.println("Programmer II !");
			System.out.println("your average is " + Student.average);
			
			grades();
			awards();
			
			
		}
		public void input()
		{
		
			Scanner user_input = new Scanner(System.in);
			System.out.print("Enter your name ");
			this.name= user_input.next();
			System.out.print("are you programmer type I or II, please enter either 1 or 2");
			this.type = user_input.nextInt();
			
			this.average = averages();
			user_input.close();
			
		}
		
}

		
	