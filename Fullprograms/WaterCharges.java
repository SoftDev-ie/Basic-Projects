package Fullprograms;

import java.util.Scanner;

public class WaterCharges {
	private int accountnumber = 3200;
	static char useCode;
	static double gallons;
	static double moneydue;
	
	static WaterCharges t= new WaterCharges(); 
	
	public static void main(String[] args) {
		
	  t.input();
	}
	public void input(){
		
		int number;
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter the account number");
		number = user_input.nextInt();
	    if(number== accountnumber){
	    	t.input2();
	    	t.useCheck();
	    	t.output();
	    	
	    	}
	    else{
	    	System.out.println("please enter the correct account number");
	    	t.input();
	    	
	    	}
	}
public void input2(){
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("What type of user code do you use (H - Home use, C - Commercial use, I - Industrial use");
		useCode = user_input.next().charAt(0);
		 Character.toUpperCase(useCode);
		 System.out.print("Enter the amount of gallons used");
		 gallons = user_input.nextDouble();
	    	}

public void useCheck(){
	
	if(useCode == 'H'){
		moneydue = gallons*5.05;
    	}
	else if (useCode == 'C'){
			if (gallons>4000000){
				double tempgallons= gallons - 1000;
				moneydue = (tempgallons*0.025)+1000;
			}
			else{
				moneydue = 1000;
			}
			}
	else if (useCode == 'I'){
			if(gallons<=4000000){
				moneydue = 1000;
			}
			if(gallons>=4000000 && gallons <= 10000000){
				moneydue = 2000;
			}
			else{
				moneydue = 3000;
			}
	}

	}
public void output(){
	
	System.out.print("the account number is "+accountnumber+
			"\n"+ "The type of usage is----- "+useCode+ 
			"\n"+"the money due is "+ moneydue);
	
    	}

}


