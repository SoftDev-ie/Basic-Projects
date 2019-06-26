package operations1;

public class Errorfix {
		public static void main(String[] args)
			{
			printArray(new int[] {3,1,2,6,4,2});
			
			}
		public static void printArray(int[] myarray){
			
			
			System.out.println("This Array" + myarray);
			for(int I:myarray){
				System.out.print( I+" ");
			}
		}

}
