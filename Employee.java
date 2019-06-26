public class Employee {
		private String name;
		private int salary;
		private String roleDetails;
		
		
		Employee(String x){//constructor
			this.name=x;
			
		}
					
		public static void main(String[] args) {
			
			Employee individual = new Employee("Micheal Keaton");
			individual.salary = 30000;
			individual.roleDetails = "Supreme Leader";
			
			System.out.println(individual.name);
			System.out.println("$"+individual.salary);
			System.out.println(individual.roleDetails);
		}
}	