package javacollection;
import java.util.Arrays;
//implements Comparable
class Emp implements Comparable<Emp>{
	String name;
	int id;
	
	@Override
	public int compareTo(Emp shubham) {
		
		if(this.name.compareTo(shubham.name)!=0) {
			return this.name.compareTo(shubham.name);
		}
		else {
			return this.id-shubham.id;
		}
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
}
public class Test16 {

	public static void main(String[] args) {
		
		int n = 5;
		Pair arr[] = new Pair[n];
		arr[0] = new Pair("shubham",3);
		arr[1] = new Pair("shubham",4);
		arr[2] = new Pair("manoj",5);
		arr[3] = new Pair("manoj",2);
		arr[4] = new Pair("manoj",0);
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}	
	}
}
