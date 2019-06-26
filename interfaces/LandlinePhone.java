package interfaces;

public class LandlinePhone implements Phone,Skype{
	private boolean callinProgress;
	
	public void dialNumber(int number){
		System.out.println(number);
	}
	public boolean isCalling (){return callinProgress;}
	
	@Override
	public void contactList(String contact) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void LengthofCall(int counter) {
		// TODO Auto-generated method stub
		
	}
}
