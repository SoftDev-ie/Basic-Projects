
class AClass {
	private int x;
	
	AClass(int x){//constructor
	this.x=x;
	System.out.println(x);
}//end constructor

	int add (AClass ref){
	return x +ref.x;
	} //end add()

public static void main(String[] args) {
	AClass A = new AClass(5);
	AClass ref = new AClass(10);
	int z =ref.add(A);
	System.out.println(z);
	
	Person P = new Person ();
	P.SetName("bob");
	System.out.println(P.getName());
	
	}
}//end AClass