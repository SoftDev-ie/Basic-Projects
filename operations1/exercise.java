package operations1;

public class exercise {
public static int sum(int il,int i2){
	int result =0;
	for(int i = il; i<=i2;i++)
		result+=i;
	return result;
	}
public static void main(String[] args){
	System.out.println("Sum from 1-10 is " + sum(1,10));
}
}

