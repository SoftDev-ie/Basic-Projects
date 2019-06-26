package Arrays;

public class CharArray {
String girl = new String("shauna");
char[] name = new char[]{'P','a','u','l'};
String person = new String(name);
static char[] charArray ={3,5,6,7,7,9,6,5,4,5};
static byte[] byteArray ={1,2,3,4,5,6};
String CArray = new String(charArray);
String BArray = new String(byteArray);
public static void main (String[] args){
	
	System.out.println("welcome to thomond park!");
	String s = new String("hello");
	String s1 = new String();
	String s2 = new String (s);
	String s3 = new String (charArray);
	String s4 = new String (charArray,6,3);
	String s5 = new String (byteArray,2,4);
	String s6 = new String(byteArray);
	
	System.out.println(s6);
	System.out.println(s4);
}

}
