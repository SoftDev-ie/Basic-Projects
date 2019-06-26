package encapulation;

class DateOne
{
	private String day;
	private String month;
	private int year;
	
	void setday(String a)
	{
		day=a;
	}
	String getday(){
		return day;
	}
	void setmonth(String b)
	{
		month=b;
	}
	String getmonth(){
		return month;
	}
	void setyear(int c)
	{
		year=c;
	}
	int getyear(){
		return year;
	}
	
}