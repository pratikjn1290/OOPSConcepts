package encapsulationConcept;

public class Persons {

	// Scope of the private is within the class
	// Encapsulation means class variables and methods data member (non static
	// methods and variable)
	// To hide implementation of data members
	// Encapsulation means (Accessing private data members through public layer)
	// Use Case
	//Get will always return results,
	//Data hiding can be achieved using Encapsulation,
	//Browser launch action,

	private String name;
	private String work;
	private int Age;
	private double Salary;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public int getAge() {
		return Age;
	}

	public void setSalary(double salary) {
		this.Salary = salary;
	}

	public double getSalary() {
		return Salary;
	}

}