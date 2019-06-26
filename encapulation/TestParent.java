package encapulation;

public class TestParent {
	
	public static void main(String args[])
	{
		Child ob = new Child();
		System.out.println("output from child "+ob.someMethod());
	}
}
