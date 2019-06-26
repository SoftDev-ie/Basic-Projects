package abstractclasses;

public class Employee extends Person {
	private int empId;
	
	public Employee(String nm, String gen, int id){
		super(nm,gen);
		this.empId = id;
	}
	@Override
	public void work() {
		if (empId == 0){
			System.out.println("not working");
		}else{
			System.out.println("Working as an employee!!");
			
		}
	}

	
}