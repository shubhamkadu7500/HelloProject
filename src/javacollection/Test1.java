package javacollection;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ram");
		al.add("sai");
		al.add("manoj");
		al.add("shubham");
		al.add("raj");
		
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
			System.out.println("---------");
		}
		System.out.println(al);
	}
}
