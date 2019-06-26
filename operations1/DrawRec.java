package operations1;
import java.util.Scanner;

public class DrawRec {
		
		static	int height;
		static	int width;
		static String s2;
		static char y ='-';

			
		public static void main(String[] args) {

			input();
				
			}
		public static void input(){
			
			Scanner user_input = new Scanner(System.in);
			System.out.print("please enter the height of the rectangle");
			height = user_input.nextInt();
			System.out.print("please enter the width of the rectangle");
			width = user_input.nextInt();
			
			forloop1();
			user_input.close();
			
		}
			
		public static void forloop1(){
			int i;
			
				
			for(i = 0; i <height+2; i++){
				System.out.print("*");
				forloop2();
				System.out.print(s2);
				System.out.println("|");
				System.out.println(s2);
				}
			}
			public static void forloop2(){
				String s = "";
				char t= ' ';
			int x;
			for(x = 0; x <width-2; x++){
			    s += t;
			    s2 +=y;
				}
			System.out.print(s);
			}
}
