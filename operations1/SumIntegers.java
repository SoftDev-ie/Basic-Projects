package operations1;

import java.util.ArrayList;

public class SumIntegers {
static	ArrayList<Integer> num1 = new ArrayList<Integer>();
static	ArrayList<Integer> num2 = new ArrayList<Integer>();
static	ArrayList<Integer> num3 = new ArrayList<Integer>();
	
	public static void main(String[] args){
	SumIntegers t = new SumIntegers();
	
		t.allMethods();
		t.sum(num1);
		t.sum(num2);
		t.sum(num3);
	}
	
	
	
	public void allMethods(){
		onetoten();
		twentyTo37();
		thirty5To49();
		
	}
	public void onetoten()
		{
		
			for(int i =0; i<10; i++) num1.add (i);
			System.out.println(num1);
		}

	public void twentyTo37()
		{
		
		for(int i =20; i<=37; i++) num2.add (i);
		System.out.println(num2);
		
		}
	public void thirty5To49()
	{
	
	for(int i =35; i<=49; i++) num3.add (i);
	System.out.println(num3);
	
	}
	public void sum(ArrayList<Integer> array){
		int sum = 0;
		//for(int i=0; i<array.size();i++)
		for(int num : array){
			sum =sum+num;
		}
		System.out.println("the sum equals = " +sum);
		
	}
}