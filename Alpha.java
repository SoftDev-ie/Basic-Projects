import java.util.Scanner;

class Alpha {
	static char vowel;
	
	public static void main( String args[]){
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter a letter");
	    vowel = user_input.next().charAt(0);
	    user_input.close();
		
		if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o'|| vowel == 'u'){
			System.out.println(vowel+ " is vowel");
						
		}
		else{
		System.out.println(vowel + " is a consonant");
		vowel ++;
		condition(  vowel );
		}
}
	public static void condition(char c){
		if(vowel != 'a' && vowel != 'e' && vowel != 'i' && vowel != 'o' && vowel != 'u')
		{
			System.out.println(vowel + " is a consonant");
			
			
			
		}
		else{
		
			System.out.println(vowel+ " is vowel");
		
		}
	}
}
