package javaexceptionhandling;

public class MathDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 =0;
		try {
			double d = (double)(num1/num2);
			System.out.println(d);
		}catch(ArithmeticException ex) {
			System.out.println("Can not divide by num2");
		}finally {
			System.out.println("finally block");
		}
	}

}
