package interfaceConcepts;

//Interface uses Implements as keyword when used by any class,
//No object can be created,
//Interface has only method declaration,
//Interface defines only rules,
//Class can implement multiple interface,
//implemented class can have its own methods
//Methods are overridden from parent class
//static and final methods and variables can not be overridden,

public class ApolloHospital implements INDIANMedical,UKMedical, USMedical, BrazilMedical {

	@Override
	public void physocology() {
		System.out.println("India physocology");
	}

	@Override
	public void gatrology() {
		// TODO Auto-generated method stub
		System.out.println("India gatrology");

	}

	@Override
	public void gynacology() {
		// TODO Auto-generated method stub
		System.out.println("India gynacology");

	}

	@Override
	public void oncology() {
		// TODO Auto-generated method stub
		System.out.println("US oncology");
		
	}

	@Override
	public void nepthology() {
		// TODO Auto-generated method stub
		System.out.println("US nepthology");
	}

	@Override
	public void bronchology() {
		// TODO Auto-generated method stub
		System.out.println("US bronchology");
	}

	@Override
	public void physiotherapi() {
		// TODO Auto-generated method stub
		System.out.println("UK physiotherapi");
	}

	@Override
	public void nureo() {
		// TODO Auto-generated method stub
		System.out.println("UK nureo");
	}

	@Override
	public void urology() {
		// TODO Auto-generated method stub
		System.out.println("UK urology");
	}

	@Override
	public void polio() {
		// TODO Auto-generated method stub
		System.out.println("Whoo- Polio");
	}

	@Override
	public void meseles() {
		// TODO Auto-generated method stub
		System.out.println("Whoo- Meseles");
	}

	@Override
	public void covidCare() {
		// TODO Auto-generated method stub
		System.out.println("Whoo- COVID");
		
	}

	@Override
	public void homeopathy() {
		// TODO Auto-generated method stub
		System.out.println("Brazil-homeopath");
	}

	@Override
	public void allopathy() {
		// TODO Auto-generated method stub
		System.out.println("BZ - allopathy");
		
	}

	@Override
	public void world() {
		// TODO Auto-generated method stub
		System.out.println("Control Issue");
		
	}

	@Override
	public void un() {
		// TODO Auto-generated method stub
		System.out.println("UN");
		
	}

}
