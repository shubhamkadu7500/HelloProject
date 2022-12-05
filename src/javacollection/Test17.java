package javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User{
	int user_id;
	String name;
	String email;
	
	public User(int user_id, String name, String email) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + "]";
	}
		
}
class SortUserById implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		// TODO Auto-generated method stub
		return u1.user_id-u2.user_id;
	}
	
}
class SortUserByName implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		// TODO Auto-generated method stub
		return u1.name.compareTo(u2.name);
	}
	
}
class SortUserByEmail implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		// TODO Auto-generated method stub
		return u1.email.compareTo(u2.email);
	}
	
}
public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> arr = new ArrayList<User>();
		arr.add(new User(101,"shubham","2shubham.com"));
		arr.add(new User(112,"manoj","4manoj.com"));
		arr.add(new User(113,"ram","3ram.com"));
		arr.add(new User(107,"suraj","1suraj.com"));
		
		System.out.println("unsorted: ");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("==============");
		
		Collections.sort(arr,new SortUserById());
		System.out.println("Sorted User By Id: ");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("==============");
		
		Collections.sort(arr,new SortUserByName());
		System.out.println("Sorted User By User Name: ");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("==============");
		
		Collections.sort(arr,new SortUserByEmail());
		System.out.println("Sorted User By User Email: ");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		

	}

}
