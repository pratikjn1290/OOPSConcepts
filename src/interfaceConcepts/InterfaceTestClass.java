package interfaceConcepts;

public class InterfaceTestClass extends ApolloHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApolloHospital Ah = new ApolloHospital();

		INDIANMedical.philosphy();
		Ah.emergancy();
		Ah.bronchology();
		Ah.gatrology();
		Ah.gynacology();
		Ah.nepthology();
		Ah.oncology();
		Ah.physiotherapi();
		Ah.nureo();
		Ah.physocology();
		Ah.urology();
		Ah.allopathy();
		Ah.covidCare();
		Ah.meseles();
		Ah.homeopathy();
		Ah.polio();
		System.out.println(USMedical.fees);

		WHO who = new ApolloHospital();
		who.covidCare();
		who.meseles();
		who.polio();

		// reference variable is from parent class
		// Child class object can be refereed by parent interface variable:- TopCasting.

		UKMedical uk = new ApolloHospital();
		uk.nureo();
		uk.physiotherapi();
		uk.urology();

		// reference variable is from parent class

		USMedical us = new ApolloHospital();
		us.bronchology();
		us.nepthology();
		us.oncology();
		us.covidCare();
		us.meseles();
		us.polio();

	}

}
