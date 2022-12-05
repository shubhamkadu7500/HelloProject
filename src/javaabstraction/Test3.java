package javaabstraction;
//multiple inheritance

public class Test3 implements Inter1,Inter2 {
	public void scaning() {
		System.out.println("scaning--.");
	}
	
	public void printing() {
		System.out.println("printing--.");
	}

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		t1.printing();
		System.out.println("--------------");
		t1.scaning();

	}

}
