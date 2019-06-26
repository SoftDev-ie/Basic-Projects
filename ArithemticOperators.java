
public class ArithemticOperators {

	public static void main(String[] args) {
		int A =3;
		int B =2;
			
		
		System.out.println("Addition = "+ (A+B) +"\n"
				+ "Subtration =" +(A-B)+"\n"
				+ "Multiplication =" +(A*B) +"\n"
				+ "Division = " +(A/B)+"\n"
				+ "Modulus =" +(A%B)+"\n"
				+ "Addition Assignment = " +(A+=B)+"\n");
		A=3;
		B=2;
		
		System.out.println("Subtraction Assignment =" +(A-=B)+"\n");
		
		A=3;
		B=2;
		
		System.out.println("Multiplication Assignment =" +(A*=B)+"\n");
		A=3;
		B=2;
		
		System.out.println("Division Assignment =" +(A/=B) +"\n");
		A=3;
		B=2;
		
		System.out.println("Modulus Assignment = " +(A%=B)+"\n");
		A=3 ;
		B=2 ;
		
		System.out.println("Increment =" +(++A)+","+(++B) +"\n"
				+ "Decrement =" +(--A)+","+(--B));
		}

}