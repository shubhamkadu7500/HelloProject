package javacondition;
import java.util.Scanner;

// if condition
public class Test1 {

	public static void main(String[] args) {
		System.out.println("Enter the no: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		//int age = 17;
		
		
		if(age >= 18) {
			System.out.println("Eligiable to vote!!");
		}
		else {
			System.out.println(" Not Eligiable to vote!!");
		}

	}

}
