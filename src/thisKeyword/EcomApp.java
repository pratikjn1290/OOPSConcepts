package thisKeyword;

public class EcomApp {

	public EcomApp login(String Username, String Password) {
		System.out.println("Login with username and passwords");
		return this;
	}

	public EcomApp Search(String productname)

	{
		System.out.println("Sesarch with prodcut name");
		return this;
	}

	public EcomApp search(double price) {
		System.out.println("Search using price");
		return this;
	}

	public EcomApp addtocart(String productname) {
		System.out.println("Added in cart");
		return this;
	}

	public EcomApp checkout(String productname) {
		System.out.println("Check out");
		return this;
	}

	public EcomApp dopayment(double cardno, int Password)

	{
		System.out.println("Card No");
		return this;
	}

	public EcomApp generateOrder(String ProductName) {
		System.out.println("Order Id is 1234567");
		return this;
	}
}
