package javacollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test13 {

	public static void main(String[] args) {
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		obj.add("manoj");
		obj.add("raj");
		obj.add("suraj");
		
		
		Iterator<String> it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
