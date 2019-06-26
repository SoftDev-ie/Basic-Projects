package abstractclasses;

abstract class Student {
	protected static String name;
	protected static int type;
	protected static double average;
	protected static String award;
	
	public Student(String nm, int type,double average){
		this.name=nm;
		this.type = type;
		this.average = average;
		
	}
	public abstract void grades();
	public abstract void awards();
	public abstract double averages();
	public abstract void display();
	public abstract void input();
}

