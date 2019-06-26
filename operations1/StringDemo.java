package operations1;

public class StringDemo {
	
	public static void main(String[] args){
		String letters = "abcdefghijklmnopthis is the added part of string";
		int output;
		String letters2 = "";
		String letters3 = "";
		String s = new String ("Have a nice Day");
		
		System.out.println("String Length = "+s.length());
		
		System.out.println("Modified String = " + s.replace('n','N'));
		
		System.out.println("Converted to Uppercase = " +s.toUpperCase());
		
		System.out.println("Converted to lower case = " +s.toLowerCase());
		
		output = letters.indexOf('c');
		letters2 =("'c' is located at index " + output);
		System.out.println(letters2);
		
		output = letters.indexOf('a',1);
		letters2 =("'a' is located at index " + output);
		System.out.println(letters2);
		
		output = letters.lastIndexOf("f");
		letters2 =("Last index of 'a'" + output);
		System.out.println(letters2);
		
		letters3 = letters.substring(20);
		System.out.println(letters3);
		
		letters3 = letters.substring(0,6);
		System.out.println(letters3);
}
}