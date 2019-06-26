package operations1;

public class Conatenation {
	
	public static void main(String[] args) {
	String s1 ="x";
	String s2 ="y";
	String name = "Robert";
	char firstInitial = "Robert".charAt(0);
	
	
		String s = "hello ";
		s+= " word ";
		//equivalent to
		s= s+ " word ";
		s+= "42";
		System.out.println(s);
		
		s1+=s2; // s1=s1.concat(s2);
		s1=s2+ "etc";// s1=s2.concat("etc");
		
		System.out.println(s1);
		
		
		System.out.println(name + " " + firstInitial);
		}
}
