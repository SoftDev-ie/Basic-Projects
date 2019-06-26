package Fullprograms;
import java.util.Scanner;

public class Fibonacci {
	static int i = 0;
	static int sequence;
	static int num =0;
	
		
	static Fibonacci t= new Fibonacci();
		
			public static void main( String args[]){
				
					t.output();
					
						   }
						
						public void output(){
													
							Scanner user_input = new Scanner(System.in);
							
							System.out.print("Starting number");
							num = user_input.nextInt();
							System.out.print("amount of numbers in the sequence");
							sequence = user_input.nextInt();
							user_input.close();
							
							if(num==0)
							{
								t.calculation1();
							}
							else
							{
								t.calculation2();
							}
						}
							
						public void calculation1(){	
						int temp = num;
						num =1;
						int temp2 = num;
						System.out.print ("0 "+num+" ");
							
						while ( i+1 <sequence)
							{
								System.out.print(num+" ");
								temp= temp2;
								temp2 = num;
								num = num+temp;
															
								i++;
									   
						}
						}
						public void calculation2(){	
							int temp = num;
							int temp2 = num;
							while ( i <sequence)
								{
									System.out.print(num+" ");
									temp= temp2;
									temp2 = num;
									num = num+temp;
									i++;
				}
		}
}	