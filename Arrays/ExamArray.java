package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ExamArray {
	static ArrayList<String> results = new ArrayList<String>();
	
		static int average;
		static int i;
		public static void main( String args[]){
			
			ExamArray t= new ExamArray();
			Scanner user_input = new Scanner(System.in);
			
			//input to decide the conditions of for loop for input method
		    System.out.print("how many subjects did you take?");
		    int amount = user_input.nextInt();
			t.input(amount);
		    
			
		    
		    System.out.println("your grades are : "+results);
		   
		}
		public void input(int i){   //takes in the input and calls other methods
			Scanner user_input = new Scanner(System.in);
			
		    for(int a=0; a<i;a++){
		     
			
			System.out.print("please enter Score one");
		    int score1 = user_input.nextInt();
		    System.out.print("please enter Score two");
		    int score2 = user_input.nextInt();
		    System.out.print("please enter Score three");
		    int score3 = user_input.nextInt();
		    
		    
		    conaverage(score1,score2,score3); // works out the average and assigns an int counter
			
		    method1(); // populates the arraylist with grades
		    }
		    user_input.close();
		}
		public void conaverage(int a,int b,int c){
			average = ((a+b+c)/3);
			
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
			    
			   	}
		public void method1(){
				switch (i)
			    {				 
				 case 1: results.add ("A");  break;
				 
				 case 2:results.add ("B");  break;
				 
				 case 3:results.add ("D");  break;
				 			 
				 default: {results.add ("F");}
			    }
		}
}


