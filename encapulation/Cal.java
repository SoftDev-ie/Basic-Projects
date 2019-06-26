package encapulation;
abstract class Cal 
{
		
	public int add(int a,int b)
	{
		int answer = a+b;
		return answer;
	}
	public int subtract(int a,int b)
	{
		int answer = a-b;
		return answer;
	}
	public double multiplication(double a,double b)
	{
		double answer = a*b;
		return answer;
	}
	public double division(double a,double b)
	{
		double answer = a/b;
		return answer;
	}
}
