package javacollection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Test10 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("shubham");
		queue.add("manoj");
		queue.add("raj");
		queue.add("ram");
		//queue.add(null);
		
		Iterator<String> it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
