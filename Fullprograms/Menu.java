package Fullprograms;

import java.util.Scanner;

class Menu{
	
	public static void main( String args[]){
		System.out.println("-"+ '\n' +"--" + "--------"+'\n'+"-"+'\n'+"|"+'\n'+
				"GEOMETRICAL FIGURE"+"|"+'\n'+"|"+'\n'+"CALCULATIONS"+'\n'+"|"+'\n'+
				"--------"+'\n'+"-"+'\n'+"| figure"+"|"+'\n'+"|"+'\n'+"|"+'\n'+
				"1. Circle"+"|"+'\n'+"|"+'\n'+"|"+'\n'+
				"2. Triangle"+"|"+'\n'+"|"+'\n'+"|"+'\n'+
				"3. Elipse"+"|"+'\n'+"|"+'\n'+"|"+'\n'+
				"4. Trapezium"+"|"+'\n'+"|"+'\n'+"|"+'\n'+
				"|"+'\n'+"--------"+'\n'+"-"+'\n'+"| Type the number Desired"+
				'\n'+"|"+'\n'+"|"+'\n'+"|"+'\n'+
				"--------"+'\n'+"-");	
		
		Menu t= new Menu();
		Scanner user_input = new Scanner(System.in);
			
	    System.out.print("please enter your selection");
	    int selection = user_input.nextInt();
	    
	    
	    
		t.method1(selection);
		user_input.close();
	   
	   
	}
		
	public void method1(int i){
			switch (i)
		    {				 
			 case 1:; circle(); break;
			 
			 case 2:; Triangle (); break;
			 
			 case 3:; Ellipse (); break;
			 
			 case 4:; Trapezium (); break;
			 
			 default: {System.out.println("you did not enter a valid selection");
			 }
			 }
		    }
			public void circle (){
				Scanner scanner2 = new Scanner(System.in);
				 System.out.print("please enter size radius");
				    int radius = scanner2.nextInt();
				    scanner2.close();
				    
			      double area = Math.PI * (radius * radius);
			      System.out.println("The area of circle is: " + area);
			     
				}
			public void Triangle (){
				 Scanner scanner3 = new Scanner(System.in);

			      System.out.println("Enter the width of the Triangle:");
			      double base = scanner3.nextDouble();

			      System.out.println("Enter the height of the Triangle:");
			      double height = scanner3.nextDouble();
			      scanner3.close();
			
			      double area = (base* height)/2;
			      System.out.println("Area of Triangle is: " + area);
			     
				} 
			public void Ellipse (){
				Scanner scanner4 = new Scanner(System.in);
				 System.out.print("please enter size of radius one");
				    int radius = scanner4.nextInt();
				 System.out.print("please enter size of radius two");
				    int radius2 = scanner4.nextInt();
				    scanner4.close();
				    
			      double area = Math.PI * (radius * radius2);
			      System.out.println("The area of the ellipse is: " + area);
			     
				} 
			public void Trapezium (){
				double a;
				 Scanner scanner5 = new Scanner(System.in);

			      System.out.println("Enter the size of base one");
			      double b1 = scanner5.nextDouble();

			      System.out.println("Enter the size of base two");
			      double b2 = scanner5.nextDouble();
			      
			      System.out.println("Enter the size of size");
			      double h = scanner5.nextDouble();
			      scanner5.close();
			     
			      a = (b1+ b2)/2*h;
			      System.out.println("\nArea of Trapezoid :"+a);
	}
}


