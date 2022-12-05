package javaarrays;

public class Test2 {

	public static void main(String[] args) {
		int numbers[] = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		System.out.println(numbers[3]);
		
		System.out.println("------------");
		// for loop
		for(int i=0; i<5; i++) {
			System.out.println(numbers[i]);
			
		}
		
		System.out.println("------------");
		// for each loop
		for(int i:numbers) {
			System.out.println(i);
		}
	}
}
