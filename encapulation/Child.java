package encapulation;

public class Child extends Parent{
	//this is method overriding
	public int someMethod(){
		int x= super.someMethod();
		System.out.println("Output from parent "+x);
	return 4;
	}
}
