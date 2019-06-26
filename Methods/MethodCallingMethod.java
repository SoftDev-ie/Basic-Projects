package Methods;
public class MethodCallingMethod {
		
	public static void main(String[] args) {
		message1();
		message2();
		System.out.println("done with main");
		
	}
	public static void message1(){
		System.out.println("this is the message");
	}
	public static void message2(){
		System.out.println("this is message2");
		message1();
		System.out.println("done with message2");
	}
}