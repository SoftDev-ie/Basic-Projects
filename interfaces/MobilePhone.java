package interfaces;

public class MobilePhone implements Phone,Skype
{
	
	private boolean callinProgress;
	
	public void dialNumber(int number)
	{
		
	}
	
		public boolean isCalling()
			{
			return callinProgress;
			}

		
		public void contactList(String contact) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void LengthofCall(int counter) {
			// TODO Auto-generated method stub
			
		}
}

