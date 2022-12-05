package javaexceptionhandling;

public class Test10 {
	
	static void validateAge(int age){
		if(age < 18) {
			throw new ArithmeticException("User eligible to vote!!");
		}else {
			System.out.println("User is Eligible to vote");
		}
	}
	public static void main(String[] args) {
		System.out.println("start");
		validateAge(19);
		System.out.println("done");
	}
		

}
