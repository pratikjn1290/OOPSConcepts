package constructorConcept;

public class Employee {

	// Class variables
	String name;
	String department;
	boolean permanent;
	double salary;
	char gender;

	// Constructor name should be same as class name,
	// Constructor does not have any return type,
	// looks like function,
	// ASAP create object constructor is called,
	// Does not return any thing
	// Constructor with parameter is called parameterized constructor,
	// default constructor means no parameters
	// constructor overloading is possible
	// Duplicate constructor is not allowed
	// Use of constructor is to initialize class varible

	public Employee() {
		System.out.println("Hello Employee");
	}

	public Employee(String name) {
		System.out.println("1 Parameter");
	}

	public Employee(String name, String department) {
		System.out.println("Two Parameter");
	}

	public Employee(String name, String department, boolean permanent) {
		System.out.println("3 Parameter");
	}

	public Employee(String name, String department, boolean permanent, double salary) {
		System.out.println("4 Parameter");
	}

	public Employee(String name, String department, boolean permanent, double salary, char gender) {
		System.out.println("Five Parameter");
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee("James");
		Employee emp2 = new Employee("Pratik", "QA");
		Employee emp3 = new Employee("Pra", "QA1", true);
		Employee emp4 = new Employee("Prag", "QA1", false, 123.455);
		Employee emp5 = new Employee("Grad", "Dev", false, 1234.65, 'm');
	}

}
