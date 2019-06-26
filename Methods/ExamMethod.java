package Methods;
public class ExamMethod {
		static int Exam1 = 95;
		static int Exam2= 89;
		static int Exam3 = 93;
		
		public static void main(String[] args) {
		System.out.println("Alice Does exam Average is");
		message();
	}
	public static void message(){
		double Average =(double)(Exam1+Exam2+Exam3)/3;
		System.out.printf("%.2f",Average);
	}	
}