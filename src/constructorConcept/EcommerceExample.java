package constructorConcept;

import java.util.ArrayList;

public class EcommerceExample {
	
	String productname;
	double price;
	String color;
	ArrayList<String> sellername;
		
	public EcommerceExample(String productname) {
		this.productname = productname;
	}
	
	public EcommerceExample(String productname, double price) {
		super();
		this.productname = productname;
		this.price = price;
	}
	
	public EcommerceExample(String productname, double price, String color) {
		super();
		this.productname = productname;
		this.price = price;
		this.color = color;
	}

	public EcommerceExample(String productname, double price, String color, ArrayList<String> sellername2) {
		this.productname = productname;
		this.price = price;
		this.color = color;
		this.sellername = sellername2;
	}
	
	

	public static void main(String args[])
	
	{
		EcommerceExample EcE = new EcommerceExample("Nike Shoes");
		EcommerceExample EcE1 = new EcommerceExample("Apple", 40000);
		EcommerceExample EcE2 = new EcommerceExample("Macbok", 300000, "white");
		
		ArrayList<String> Sellername = new ArrayList<String>();
		Sellername.add("Neon");
		Sellername.add("zoem");
		
		EcommerceExample EcE3 = new EcommerceExample("AppleProd", 40000, "green", Sellername);
		System.out.println(EcE3.productname + " " + EcE3.price + " " + EcE3.color + " " + Sellername.get(0));
	}

}
