package constructorConcept;

public class PersonManagement {

	String name;
	int age;
	String gender;
	double salary;
	
	public PersonManagement(String name)
	{
		this.name = name;
		System.out.println("Called Constructor");
	}
	

	public PersonManagement(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("Called Constructor");
	}
	
	public PersonManagement(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		System.out.println("Called Constructor");
	}
	
	public PersonManagement(String name, int age, String gender, double salary)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		System.out.println("Called Constructor");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonManagement pm = new PersonManagement("Jain", 23);
		System.out.println(pm.name);
		System.out.println(pm.age);

	}

}
