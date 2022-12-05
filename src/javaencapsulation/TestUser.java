package javaencapsulation;

public class TestUser {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUserName("manoj");
		user1.setPassword("1234");
		
		System.out.println(user1.getUserName() + " " + user1.getPassword());
		
		User user2 = new User();
		user2.setUserName("shubham");
		user2.setPassword("54321");
		
		System.out.println(user2.getUserName() + " " + user2.getPassword());
		

	}

}
