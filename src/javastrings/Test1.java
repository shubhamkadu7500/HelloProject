package javastrings;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr = {'w','e','l','c','o','m','e'};
		System.out.println(String.copyValueOf(arr));
		
		System.out.println("-------------");
		
		String msg = "welcome";
		System.out.println(msg);
		System.out.println("-------------");
		
		String s = new String("welcome");
		System.out.println(s);
		
		System.out.println("String length is: " + s.length());
		System.out.println("char at positio n : " + s.charAt(3));
		
		System.out.println(s.toUpperCase());
		
		String s1 = "BYE";
		System.out.println(s1.toLowerCase());
		
		

	}

}
