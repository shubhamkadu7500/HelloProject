package javacollection;

import java.util.Iterator;
import java.util.Stack;

public class Test9 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.pop();
		
		Iterator<Integer> it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
