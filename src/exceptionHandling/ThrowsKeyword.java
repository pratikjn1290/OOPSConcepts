package exceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub

		ThrowsKeyword TK = new ThrowsKeyword();
		TK.m1();

	}

	public void m1()

	{
		System.out.println("Method M1");
		m2();
	}

	public void m2() throws ArithmeticException

	{
		System.out.println("Method M2");
		m3();
	}

	public void m3() 

	{
		System.out.println("Method M3");
		try {
			int i = 9 / 0;
		}

		catch (ArithmeticException e) {
			System.out.println("AME is Coming");
		}
	}

}
