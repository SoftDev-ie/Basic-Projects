package encapulation;

public class Password {
	private int password = 54321;
	
		private int getpassword(){
			return password;
		}

public void check(int temp)
{
		
	if(temp == getpassword())
		{
	 		System.out.println("The Password is correct!");
	 	}
	 else
	 	{
	 		System.out.println("the password is incorrect");
	 	}	
	}
}
