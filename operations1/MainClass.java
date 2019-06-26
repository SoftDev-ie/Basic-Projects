package operations1;

public class MainClass{

	public static void main( String args[]){
		int value = 8;
		int count = 10;
		int limit = 11;
		
		if (++value %2 == 0 && ++count < limit ) {
			System.out.println("here");
			System.out.println(value);
			System.out.println(count);
		}
		else{
			System.out.println("there");
			System.out.println(value);
			System.out.println(count);
		}
			
	}
}