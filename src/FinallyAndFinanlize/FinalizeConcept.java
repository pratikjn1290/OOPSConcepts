package FinallyAndFinanlize;

public class FinalizeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("Hello");
		FinalizeConcept fc = new FinalizeConcept();
		fc = null;
		s = null;
		System.out.println("--------Before GC--------");
		System.gc();
		System.out.println("--------After GC--------");
	}

	@Override
	public void finalize() {
		System.out.println("Finanlize method");

	}

}
