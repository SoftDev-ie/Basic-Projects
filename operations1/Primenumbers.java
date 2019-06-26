package operations1;
import java.util.Scanner;

public class Primenumbers {
static	int x;
static	int i;


	
public static void main(String[] args) {

	input();
		
	}
public static void input(){
	
	Scanner user_input = new Scanner(System.in);
	System.out.print("please enter your number");
	x = user_input.nextInt();
		
	ifloop();
	
	user_input.close();
	
}
	
public static void ifloop(){
	if((x!=1)&&(x>0)){
	for(i = x-1; i >=1; i--){
	if(i==1){
		System.out.println("this is a prime number");
		break;
	}
	if( (x%i ==0)){
		System.out.println("this is not a prime");
		break;
	}
	}
	}
	else{
		System.out.println("the number one is not a prime and primes must be greater then 0");
		}
}
}

