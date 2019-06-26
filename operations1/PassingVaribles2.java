package operations1;

public class PassingVaribles2 {
	
	public int num1 = 1;
	public int num2 = 2;
	
	public static void main (String[] args){
	PassingVaribles2 t = new PassingVaribles2();
	int num1 = 1;
	int num2 = 2;
	
	t.print();
	t.varibleChange (num1,num2);
	t.print();
	
}
public void varibleChange(int num1,int num2){
	
	int num3=num1;
	this.num1 =this.num2;
	this.num2=num3;
	System.out.println("After Swapping n1 is " + num1 + " n2 is "+ num2);
		
}
public void print(){
	System.out.println(" n1 is " + this.num1 + " n2 is "+ this.num2);
}
}
