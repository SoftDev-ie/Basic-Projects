package Arrays;

public class changingArray {
	public static void main(String[] args){
		int [] a={1,1};
		
		changeArray(a);
		System.out.println("In main(): " + "{"+a[0] +","+a[1]+"}");
	}
	public static void changeArray(int[] a){
		a[0]=3;
		a[1]=4;
		System.out.println("in changeArray();"+"{"+a[0]+","+a[1]+"}");
	}
}
