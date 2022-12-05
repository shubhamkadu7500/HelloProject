package javacollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ram");
		al.add("sai");
		al.add("manoj");
		al.add("shubham");
		al.add("raj");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
