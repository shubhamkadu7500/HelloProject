package oops;

class Product{
	int product_id;
	String product_name;
	int product_qty;
	//constructor
	Product(){
		
		System.out.println("Default constructor gets executed !!");
		product_id = 101;
		product_name = "shubham";
		product_qty =8;
	}
	
	
	
	void getProductDetails() {
		System.out.println(product_id + " " + product_name + " " + product_qty);
	}
}

public class Test3 {

	public static void main(String[] args) {
		//new produts().getProductDetails();
		Product p1 = new Product();
		p1.getProductDetails();
		p1.product_id = 103;
		System.out.println(p1.product_id);
		p1.getProductDetails();

	}

}
