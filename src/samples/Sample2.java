package samples;
import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		number = sc.nextInt();
		
		int[] numberArray =new int[100];
		System.out.println("Enter the elements of the array: ");
		
		for(int i = 0; i<number; i++) {
			numberArray[i] = sc.nextInt(); 
		}
		
		System.out.println("Array elements are : ");
		
		for(int i=0; i<number; i++) {
			System.out.println(numberArray[i]);
		}

	}

}
