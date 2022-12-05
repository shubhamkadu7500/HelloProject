package javacollection;

import java.util.ArrayList;
import java.util.Iterator;

class Demo1{
	ArrayList<Integer> al = new ArrayList<Integer>();
	void display() {
		for(int i=1;i<=1000;i++) {
			al.add(i);
		}
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
public class Test5 {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.display();

	}

}
