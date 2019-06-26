
public class Main {
public static void main(String[]args){
	House property;
	
	Main x = new Main();
	Main.House y =x.new House();
	y.display();
}
class House {
String propertyNumber;
char propertyType;
byte Stories;
int bedrooms;
double Value;

		void display(){
			System.out.println("This is how you call an inner class");

		}
	}
}
