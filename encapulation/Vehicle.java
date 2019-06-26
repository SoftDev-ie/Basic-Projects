package encapulation;

class Vehicle 
{
	//instance fields
	int noOfTyres; //no of tyres
	private boolean accessories; //check accessories present or not
	protected String brand; //Brand of car
	//Static fields
	private static int counter;// no of vehicle objects created
	//Constructor
	
	Vehicle()
	{
		System.out.println("Constructor of Super Class called");
		noOfTyres =5;
		accessories = true;
		brand = "X";
		counter ++;
	}
	//instance methods
	public void switchOn()
	{
		accessories = true;
	}

	public void switchOff()
	{
		accessories = false;
	}
	public boolean isPresent()
	{
		return accessories;
	}
	public void getBrand()
	{
		System.out.println("Vehicle Brand:" + brand);
	}
	//Static Methods
	public static void getNoOfVehicles()
	{
		System.out.println("Number of Vehicles: " +counter);
	}
}

class Car extends Vehicle
{
	private int carNo =10;
	
	public void printCarInfo()
	{
		System.out.println("Car Number: " + carNo);
	
	System.out.println("No of Tyres: " + noOfTyres); //inherited
	//System.out.println("accessories : " + acessories);
	// Not Inherited
	System.out.println("accessories : " + isPresent()); //inherited.
	//System.out.println("Brand:" + getBrand());
	//not Inherited
	System.out.println("Brand: " + brand);//Inherited.
	//System.out.println("counter: " + counter); // not inherited.
	getNoOfVehicles(); //inherited.
	
	}
}

