package javaabstraction;

interface Billing{
	void invoice_amount();
}
public class Test5 implements Billing {
	public void invoice_amount() {
		System.out.println("Total invoice amount is : 400000.");
	}
	public static void main(String[] args) {
		Test5 obj = new Test5();
		obj.invoice_amount();
	}
}
