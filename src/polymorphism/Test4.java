package polymorphism;

class Billing{
	void calculate(int bill_amount,int discount_amt) {
		int total_amount;
		total_amount = bill_amount - discount_amt;
		System.out.println(total_amount);
	}
}
class Accounts extends Billing{
	void calculate(int bill_amount,int discount_amt) {
		int total_amount;
		int tax_amount = 200;
		total_amount = bill_amount - discount_amt + tax_amount;
		System.out.println(total_amount);
	}
}
public class Test4 {

	public static void main(String[] args) {
		
		Accounts obj = new Accounts();
		obj.calculate(1200,200);
		

	}

}
