package Arrays;

public class FillArray {
	public static void main(String[] args) {
		
		int [][] M;
		M = new int [8][5];
		
		for(int row=0; row<8; row ++){
			for(int col =0; col<5; col++){
				M[row][col] = row+col;
				System.out.print(M[row][col] + " ");
				
			}
			System.out.println();;
		}
	}
}
