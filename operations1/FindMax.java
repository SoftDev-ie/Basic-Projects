package operations1;

public class FindMax {
	public static void main(String[] args){
		double x=2.1;
		double y=3.2;
		double z=1.3;
		double max;
		max = max(x,y,z);
		
		System.out.println(max);
	}

	static double max(double num1,double num2,double num3){
	double maxnum =0;
	
	if(num1<num2)
		maxnum = num2;
	else
		maxnum = num1;
	if(maxnum < num3)
		maxnum = num3;
	
	return maxnum;
}
}
