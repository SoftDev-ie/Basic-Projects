package Arrays;

public class moreArrays {
	public static void main(String[] args){
	int[] original = {11,22,33,44,55};
	int[] copy;
	copy = original;
	for(int i=0;i<copy.length;i++){
		if(i==2)copy[i]=30;
		System.out.println("My " +copy[i]);
	}
	System.out.println("original" + original[2]);
	
	}
}


