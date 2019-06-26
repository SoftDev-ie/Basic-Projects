package Arrays;

import java.util.ArrayList;

public class ListArray4 {
	public static void main(String[] args) {
		
//ADD
	ArrayList<Integer> num = new ArrayList<Integer>();
	for(int i =0; i<10; i++) num.add (i);
	System.out.println(num);
	
//Remove
	for(int i=0; i<num.size(); i++)
		if(num.get(i)%2 == 0) num.remove(i);
	System.out.println(num);
	}
}