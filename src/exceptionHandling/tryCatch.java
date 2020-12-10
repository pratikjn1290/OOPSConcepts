package exceptionHandling;

public class tryCatch {

	// Try catch is used to handle the exception we received while executing
	// respected action,
	// Nested catch can be defined,
	// Throws and Throw
	// Two type of exception available checked and unchecked exception,
	// Checked exception defined at compile time,
	// Unchecked exception found at runtime exception (Array index out of bound, File corrupted, heap memory, stack overflow)
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		try {

			int p = i / 0;
		}

		catch (ArithmeticException e) {
			System.out.println("Some exception is coming.......Bye");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.err.println();
		}

	}

}
