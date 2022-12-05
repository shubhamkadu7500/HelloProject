package javaacessmodifier;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj = new Test1();
		//System.out.println(obj.number);//Testdemo.number is not visible in Test2 because of private access modifier are used in Testdemo
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.email);

	}

}
