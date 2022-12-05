package javaexceptionhandling;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		//0  1  2  3  4
		System.out.println(arr[1]);
		// java.lang.NullPointerException
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
		System.out.println(arr[3]);
		


	}

}
