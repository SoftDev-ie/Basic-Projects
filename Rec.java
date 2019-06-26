import java.util.Scanner;

public class Rec {
	private double Width;
	private double Height;
	
	public double getHeight() {
		return Height;
		}
	public double getWidth() {
		return Width;
		}
	public void setWidth(Double A){
		Width = A;
	}
	public void setHeight(Double B){
		Height = B;
	}
public static void main(String[] args) {

	intake();
}
public static void intake(){
	Rec t= new Rec(); //creating object to use setter and getter
	
	Scanner user_input = new Scanner(System.in);
	System.out.print("Enter the Width of rectangle");
	double temp= user_input.nextDouble();
    t.setWidth(temp);
    System.out.print("Enter the Height of rectangle");
    double temp2= user_input.nextDouble();
    t.setHeight(temp2);
	double Area =((double)t.getHeight() *t.getWidth());
	System.out.print("the area of the rectangle is "+ Area);
	
}
}

