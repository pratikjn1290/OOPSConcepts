package FinallyAndFinanlize;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		try {
			System.out.println("DataBase connection Open");
			int p = i / 0;

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("DataBase connection closed");
			System.out.println("-----------Executed-----------");
		}
	}

}
