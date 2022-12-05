package oops;

public class Test5 {
	static int count = 0;//when count variable is static, it will get memory only once and retain its value.
	
	Test5(){
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		Test5 t1 = new Test5();
		Test5 t2 = new Test5();
		Test5 t3 = new Test5();
	}

}
