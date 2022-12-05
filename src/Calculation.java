
public class Calculation {
	static int result;
	
	static void addition(int x, int y) {
		result = x+ y;
		System.out.println("addition of x and y are:"+ result);
	}
	
	static void substraction(int x, int y) {
		result = x- y;
		System.out.println("substraction of x and y are:"+ result);
	}
	
	static int multiplication(int x, int y) {
		result = x*y;
		return result;
	}
	
	static int division (int x, int y) {
		result = x/y;
		return result;
	}

	public static void main(String[] args) {
		
		addition (20,20);
		substraction(20,10);
		System.out.println("addition of x and y are:"+multiplication(10,5));
		result = division(20,5);
		System.out.println("division of x and y are:"+ result);
		// TODO Auto-generated method stub

	}

}
