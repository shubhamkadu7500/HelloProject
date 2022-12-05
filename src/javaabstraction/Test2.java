package javaabstraction;

abstract class RBI{
	
	void transaction_limit() {
		System.out.println("Allowed 50000 only.");
	}
	
	abstract void roi();
}

class SBI extends RBI{
	void roi() {
		System.out.println("rate of interest in SBI is : 7% ");
	}
}
class HDFC extends RBI{
	void roi() {
		System.out.println("rate of interest in HDFC is : 9% ");
	}
}
public class Test2 {

	public static void main(String[] args) {
		SBI obj = new SBI();
		obj.roi();
		System.out.println("---------");
		
		HDFC obj1 = new HDFC();
		obj1.roi();
		obj1.transaction_limit();

	}

}
