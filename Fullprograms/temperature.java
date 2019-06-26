package Fullprograms;
import java.util.Scanner;

public class temperature {
private double degreesC;


	public double getC() {
	return degreesC;
	}
		
	public void setC(Double C){
		degreesC = C;
	}
	
		
	public static void main(String[] args) {
		
		CtoD();
		
	}
	public static void CtoD(){
		temperature t= new temperature(); //creating object to use setter and getter
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter the temperature in Celsius");
	double temp= user_input.nextDouble();
	    t.setC(temp); // setter method to set degreesC
		double degreesF = ((t.getC() *1.8)+32); // calculation for converting celcius to fehren using getter
		System.out.println(degreesF);
	}
}
