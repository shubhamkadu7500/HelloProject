package javacollection;

class Test<T>{
	T obj;
	
	Test(T obj){
		this.obj=obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}
public class Test6 {

	public static void main(String[] args) {
		Test<Integer> iobj = new Test<Integer>(10);
		System.out.println(iobj.getObject());
		
		Test<String> sobj = new Test<String>("shubham");
		System.out.println(sobj.getObject());

	}

}
