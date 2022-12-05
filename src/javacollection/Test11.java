package javacollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Test11 {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("shubham");
		dq.add("manoj");
		dq.add("raj");
		dq.add("ram");
		dq.add("suraj");
		
		Iterator<String> it = dq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
