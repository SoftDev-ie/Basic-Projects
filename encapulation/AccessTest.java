package encapulation;

 class Encapulation {
	

	int a; //default access
	public int b; //public access
	private int c; //private access
	//protect applies only when inheritance is involved
	//methods to access c
	void setc(int i){
		c=i;
	}
	int getc(){//get c's value
		return c;
	}
 }
	class AccessTest {
		public static void main (String args[]) 
		{
		
			Encapulation ob = new Encapulation();
		
			//These are OK, a and b may be accessed directly
		
			ob.a=10;
			ob.b=20;
		
			//this is not OK and will cause an error
			//ob.c=100;//error!
			//you must access c through its methods
		
			ob.setc(100);//OK
			System.out.println(ob.a+" "+ob.b+" "+ob.getc());
		
		}
}



