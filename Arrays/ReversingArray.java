package Arrays;

import java.util.*;

public class ReversingArray {
	public static void main(String[] args){
		ReversingArray t = new ReversingArray();
		int[] array1;
		array1 = new int[8];
		
		
		t.populateArray(array1);
		t.print(array1);
				
		array1 = reverseArray(array1);
		t.print(array1);
		
		t.reversedArray(array1);
		t.print(array1);
	}
	public void populateArray(int[] a){
		
		for(int row=0; row<a.length; row ++){
			
				a[row] = row;
				
				
			}
	}
	static int[] reverseArray(int[] a){
		int[] b = new int[a.length];
		int i =0;
		for(int row=a.length-1; row >=0; row --){
			b[i] = a[row];
			i++;
		}
		return b;
	}
	void reversedArray(int[] a){
		int[] b = new int[a.length];
		int i =0;
		int numberInside = 0;
		for(int row=a.length-1; row >=0; row --){
			numberInside = a[row];
			b[i] = numberInside;
			i++;
		}
		for (int j = 0; j < a.length; j++) {
			numberInside = b[j];
			a[j] = numberInside;
		}
	}
	public void print(int[]a){
		for(int row=0; row<a.length; row ++){
			
			
			System.out.print(a[row] + " ");
		}
		System.out.println(" ");
	}
}


