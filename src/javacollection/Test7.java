package javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test7 {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
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
