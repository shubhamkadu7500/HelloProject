package javainheritance;

//herichical inheritance
class Product{
	String product_name;
	double product_cost;
	int product_qty;
	public Product(String product_name, double product_cost, int product_qty) {
		super();
		this.product_name = product_name;
		this.product_cost = product_cost;
		this.product_qty = product_qty;
	}
	
	void getProductDetails() {
		System.out.println(this.product_name + " " + this.product_cost + " " + this.product_qty);
	}
}

class Laptop extends Product{

	public Laptop(String product_name, double product_cost, int product_qty) {
		super(product_name, product_cost, product_qty);
		
	}
	
}

class Desktop extends Product{

	public Desktop(String product_name, double product_cost, int product_qty) {
		super(product_name, product_cost, product_qty);
		
	}
	
}

class Tab extends Product{

	public Tab(String product_name, double product_cost, int product_qty) {
		super(product_name, product_cost, product_qty);
		
	}
	
}
public class Test5 {

	public static void main(String[] args) {
		Tab t1 = new Tab("apple a1",12345,1);
			t1.getProductDetails();
			
		Desktop d1 = new Desktop("dell a1",123456,5);
		d1.getProductDetails();
		
		Laptop l1 = new Laptop("hp i5",19000,1);
		l1.getProductDetails();
		

	}

}
