package operations1;

public class Passingvaribles {
	
	public static void main(String args[])
	{
		Person person = new Person ("chris");
		int i =7;
	
		person.display(i,10);
		Passingvaribles t = new Passingvaribles();
	
		t.display(person);
	
		System.out.println(person.getName());
		System.out.println( person.name);
	
	}

		public void display(Person person)
			{
				person.display(person.a, person.b);
			}

		void display(Passingvaribles t)
			{
				Person person = new Person("Jack");
				t.display(person);
			}
}
class Person
			{
	int a;
	int b;
	String name = "Abdu";
	
		Person(String name)
			{
			this.name = name;
			}
	
		public void display(int a, int b)
			{
			a=6;
			System.out.println(a);
			}
	
		public String getName()	
			{
			return name;
			}
	
		public void setName(String name)
			{
			this.name = name;
			}
				
}