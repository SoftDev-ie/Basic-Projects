package operations1;

public class Continue {

	public static void main(String[] args) {
		
		loop();
		
	}
	
	public static void loop(){
		 int var1;
		
		for(var1 = 0; var1 < 5; var1++){
			
			for(int var2 = 0; var2 < 5; var2++)
			{
				
				if(var2 ==2)
				continue;
					
				System.out.println("var1: "+var1+ "Var2: "+var2);
				}
			}
		}
}
	