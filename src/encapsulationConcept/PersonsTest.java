package encapsulationConcept;

public class PersonsTest {

	public static void main(String args[]) {

		
		Persons p = new Persons();
		p.setName("Pratik");
		System.out.println(p.getName());
		p.setAge(32);
		System.out.println(p.getAge());
		p.setSalary(45000);
		System.out.println(p.getSalary());
		p.setWork("QA");
		System.out.println(p.getWork());
		
		
		
		
	}

}
