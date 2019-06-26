package operations1;
import java.util.ArrayList;
import java.util.Scanner;

public class GroupList{
	
		static GroupList t = new GroupList();
	
		static ArrayList<String> words = new ArrayList<String>();
	
		public static void main(String[] args) {
				
			t.input();
			t.reverse();
						
			}
		
		public void input(){
			
			Scanner user_input = new Scanner(System.in);
			
			System.out.print("enter a word");	
		
			String name = null;
		
		while (!(name = user_input.nextLine()).isEmpty()){
			System.out.print("enter a word");	
			words.add (name);
			
		}
		System.out.println(words);
			
	}
	public void reverse(){
			for (int i = words.size(); i!=0;i--)
			System.out.print(words.get(i-1));	
		}
/*	public void EndingS(){
		for (int i = words.size(); i!=0;i--){
			
			String names = words.get(i-1);
			String name2 = words.substring(String.length() - 1));
			if (words.get(i-1) = ;)
			System.out.print(words.get(i-1));
}*/
}
