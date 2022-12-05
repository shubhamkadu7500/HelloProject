package javaexceptionhandling;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		String name = "rama";
		try {
			System.out.println(name.charAt(5));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		//System.out.println(name.charAt(5));
		System.out.println(3);

	}

}
