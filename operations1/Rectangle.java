package operations1;

public class Rectangle {
double length;
double width;

 void area(int length, int width){
	int areaOfRectangle = length*width;
	System.out.println("Area of Rectangle: "+ areaOfRectangle);
	}

void area(double length,double width){
	double areaOfRectangle = length*width;
	System.out.println("Area of Rectangle:" + areaOfRectangle);}


public static void main (String args[]){
	Rectangle r1= new Rectangle();
	
	r1.area(10,20);
	r1.area(10.50, 20.50);
}
}
