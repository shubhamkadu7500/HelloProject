package javacondition;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("Enter the no: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String result;
		result =(age >=18) ? "Eligible to vote" : "Not Eligible to vote";
		System.out.println(result);
	}
}
