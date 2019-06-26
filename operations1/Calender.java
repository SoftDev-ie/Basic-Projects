package operations1;
import java.util.*;
import java.util.Scanner;


public class Calender {
	
		static int number;
		static int days;
		static int year;
		static int check;
		
		public static void main( String args[]){
			String month = "";
			
			Calender t= new Calender();
			
		   month = t.input(month);
		   	t.convert(month);
		   	t.LeapTest();
			t.run();
			System.out.println(month + " has "+days+" days in it");
			t.days();
			t.array();
			
			
			
		}
		public String input(String month){
			Scanner user_input = new Scanner(System.in);
			System.out.print("please enter the month");
			 month = user_input.nextLine();
		    System.out.print("please enter the year");
		    year = user_input.nextInt();
		    user_input.close();
		    return month;
		}
		public void convert(String i){
			
			if (i.equalsIgnoreCase("January")){
				number = 1;
			}
			else if (i.equalsIgnoreCase("February")){
				number = 2;
			}
			else if (i.equalsIgnoreCase("March")){
				number = 3;
			}
			else if (i.equalsIgnoreCase("April")){
				number = 4;
			}
			else if (i.equalsIgnoreCase("May")){
				number = 5;
			}
			else if (i.equalsIgnoreCase("June")){
				number = 6;
			}
			else if (i.equalsIgnoreCase("July")){
				number = 7;
			}
			else if (i.equalsIgnoreCase("August")){
				number = 8;
			}
			else if (i.equalsIgnoreCase("September")){
				number = 9;
			}
			else if (i.equalsIgnoreCase("October")){
				number = 10;
			}
			else if (i.equalsIgnoreCase("November")){
				number = 11;
			}
			else if (i.equalsIgnoreCase("November")) {
				number = 12;
			}
			else{
				System.out.println("please enter a valid month");
			}
		}
		
		public void run(){
					
			switch (number)
		    {				 
			 case 1: days=31;  break;
			 
			 case 2: setIf();  break;
			 
			 case 3: days=31;  break;
			 
			 case 4: days=30;  break;
			 
			 case 5: days=31;  break;
			 
			 case 6: days=30;  break;
			 
			 case 7: days=31;  break;
			 
			 case 8: days=31;  break;
			 
			 case 9: days=30;  break;
			 
			 case 10: days=31;  break;
			 
			 case 11: days=30;  break;
			 
			 case 12: days=31;  break;
			
			 default: {System.out.println("there are only 12 months");}
		    }
			}
		public void LeapTest(){
			
			if (year % 4 != 0) {
			    check =0;
			  } else if (year % 400 == 0) {
			    check =1;
			  } else if (year % 100 == 0) {
			    check =0;
			  } else {
			    check =1;
			  }
			}
		public void setIf(){
		
		if (check ==1) {
		    days = 29;
		  } else
		  {
			  days =28;
		  }
		}
		public void days(){
		String[] dayweek ={"Sunday","Monday","Tuesay","Wednesday","Thursday","Friday","Saturday"};
		for(int a=0;a<dayweek.length;a++){
			System.out.print(dayweek[a]+" ");
			System.out.print(" ");
		}
		System.out.println(" ");
		}
	public void array(){
		int[] calender = new int[days];
		int b=1; 
		for(int a=0; a < days; a++){
			calender[a]= b;
			b++;
		}
		for (int c : calender)
		System.out.print(c+" ");
	}
}
