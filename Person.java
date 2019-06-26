
public class Person {
		private String name;
		private int age;
		private int height;
		private int weight;
		private String eyeColor;
		private String gender;
		
		Person(String x){//constructor
			this.name=x;
			System.out.println(x);
		}
		Person(){
		}
		
		public String getName() {
			return name;
	}
		public void SetName(String str){
			name = str;
	}
			
		public static void main(String[] args) {
			
			Person individual = new Person("sam");
			individual.age=50;
	
		
			System.out.println(individual.age);
			individual.SetName("abdu");
			System.out.print(individual.name);

		}
		
			
}	

