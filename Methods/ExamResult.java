package Methods;


import java.util.Scanner;

class ExamResult{
	static int average;
	static int i;
	public static void main( String args[]){
			
		ExamResult t= new ExamResult();
		Scanner user_input = new Scanner(System.in);
			
	    System.out.print("please enter Score one");
	    int score1 = user_input.nextInt();
	    System.out.print("please enter Score two");
	    int score2 = user_input.nextInt();
	    System.out.print("please enter Score three");
	    int score3 = user_input.nextInt();
	    user_input.close();
	    
		t.conaverage(score1,score2,score3);
		t.method1();
	    System.out.print("your average is " + average);
	   
	   
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
			 case 1: System.out.println("congratulations your average grade is A");  break;
			 
			 case 2:System.out.println("congratulations your average grade is B");  break;
			 
			 case 3:System.out.println("congratulations your average grade is D");  break;
			 			 
			 default: {System.out.println("you complete failure, your average grade is F");}
		    }
	}
}
