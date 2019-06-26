public class DogName {
		private String name;
		private int age;
		
		
		DogName(String x){//constructor
			this.name=x;
			
		}
					
		public static void main(String[] args) {
			
			DogName individual = new DogName("Rover");
			individual.age=12;
	
			System.out.println(individual.name);
			System.out.println(individual.age);
			
		}
}	