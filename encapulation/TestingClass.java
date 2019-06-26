package encapulation;

public class TestingClass 
{
	
	public static void main(String args[])
	{
		DateThree ob = new DateThree();
		ob.setday("Monday");
		ob.setmonth("May");
		ob.setyear(2016);
		
		System.out.println(ob.getday()+" "+ ob.getmonth()+ " "+ob.getyear());
		
		DateOne ob2 = new DateOne();
		ob2.setday(ob.getday());
		ob2.setmonth(ob.getmonth());
		ob2.setyear(ob.getyear());
		
		System.out.println(ob2.getday()+" "+ ob2.getmonth()+ " "+ob2.getyear());
	}
}
