package operations1;

public class MoreString {
public static void main(String[] args) {
	String s1 ="";
	String s2 ="";
	String s3= "";
	String s4="";
	int num[] = {1,2,6,3,5,4};
	String s5 = "";
	if (s1.equals ("hello")){
		
	}
	if(s1 == "hello"){
		
	}
	if(s1==s2){
	
	}
	if(s1.equalsIgnoreCase(s2)){
		
	}
	System.out.println("s1==s2 : "+ (s1==s2));
	System.out.println("s1==s3 : "+ (s1==s3));

	s4 =s1.replace('l','k');
	System.out.println(s4);
	
	System.out.print(s1.toUpperCase());
	
	System.out.print(s1.toLowerCase());
	
	System.out.print(s1.trim());
	
	s5 =num.toString();
	
	System.out.print(s5);
	System.out.print(s1.toCharArray());
	
	String morning1 = "Morning";
	System.out.println("Morning"==morning1);
	String morning2 = "Morning";
	System.out.println("Morning"==morning2);
	}
}

