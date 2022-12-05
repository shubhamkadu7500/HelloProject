package samples;

import javaacessmodifier.Test1;
import javaacessmodifier.Test1.*;

public class Testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj = new Test1();
		System.out.println(obj.name);
		//System.out.println(obj.age);//this field Test1.age is not visible
		//System.out.println(obj.email);

	}

}
