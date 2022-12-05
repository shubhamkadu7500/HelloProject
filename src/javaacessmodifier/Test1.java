package javaacessmodifier;
//refer in sample package
public class Test1 {
	private int number = 200;
	public String name = "shubham";
	int age = 20;
	protected String email = "shubhamkadu.com";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj = new Test1();
		System.out.println(obj.number);
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.email);

	}

}
