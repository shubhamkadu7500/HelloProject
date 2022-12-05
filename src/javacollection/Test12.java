package javacollection;

import java.util.HashSet;
import java.util.Iterator;

public class Test12 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("shubham");
		set.add("manoj");
		set.add("raj");
		set.add("ram");
		set.add("suraj");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
