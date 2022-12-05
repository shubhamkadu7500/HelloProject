package javacondition;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int weekday = 11;
		System.out.println("please Enter day no:");
		Scanner sc = new Scanner(System.in);
		int weekday = sc.nextInt();
		
		switch(weekday) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wenesday");
			break;
		
		case 4:
			System.out.println("Thrusday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Enter proper no");
			
			
		}

	}

}
