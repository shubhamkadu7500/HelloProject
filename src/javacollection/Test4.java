package javacollection;

import java.util.ArrayList;
import java.util.Iterator;

class Demo{
	ArrayList<Integer> al = new ArrayList<Integer>();
	void display() {
		al.add(10);
		al.add(20);
		al.add(30);
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
public class Test4 {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.display();
		

	}

}
