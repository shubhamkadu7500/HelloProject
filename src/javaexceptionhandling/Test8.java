package javaexceptionhandling;

public class Test8 {

	public static void main(String[] args) {
		int number =20;
		try {
			System.out.println(number/0);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("finally Block Executed!");
		}

	}

}
