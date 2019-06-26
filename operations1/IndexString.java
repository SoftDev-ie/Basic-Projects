package operations1;

public class IndexString {
static String s1 = "Here There and Everywhere";

public static void main(String[] args) {
	int x = s1.indexOf("There");
	
	int y = s1.indexOf("er");
	int z = s1.indexOf("eR");
	
	System.out.println(x);
	
	System.out.println(y);
	System.out.println(z);
	}
}
