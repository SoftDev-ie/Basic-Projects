package abstractclasses;

public class Abstractmethod {
public static void main(String args[]){
	//coding in terms of abstract class
	Person student = new Employee("Jane","Female",0);
	Person employee = new Employee("bob","male",123);
	student.work();
	employee.work();//using method impemented in abstract class - inheritance
	employee.changeName("John Smith");
	System.out.println(employee.toString());
	
}
}
