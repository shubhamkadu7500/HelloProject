package javacollection;
import java.util.Iterator;
import java.util.TreeSet;

public class Test14 {

	public static void main(String[] args) {
		TreeSet<String> obj = new TreeSet<String>();
		obj.add("manoj");
		obj.add("raj");
		obj.add("suraj");
		
		Iterator<String> it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
