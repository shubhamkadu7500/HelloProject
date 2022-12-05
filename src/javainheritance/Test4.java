package javainheritance;
// multi level inheritance
class RBI{
	String rbi_roi= "7";
	RBI(){
		System.out.println("Default constructor invoked !!-RBI.");
	}
	
}

class SBI extends RBI{
	String sbi_roi= "9";
	SBI(){
		super();
		System.out.println("Default constructor invoked !!-SBI.");
	}
}

class HDFC extends SBI{
	String hdfc_roi= "11";
	HDFC(){
		super();
		System.out.println("Default constructor invoked !!-HDFC.");
	}
	
	void getAllDetail() {
		System.out.println("RBI roi: " + rbi_roi);
		System.out.println("SBI roi: " + sbi_roi);
		System.out.println("HDFC roi: " + hdfc_roi);
	}
}



public class Test4 {

	public static void main(String[] args) {
		HDFC obj = new HDFC();
		obj.getAllDetail();
		

	}

}
