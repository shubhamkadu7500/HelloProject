package oops;

class Person{
	int id = 101;
	String name ="shubham";
	int age = 23;
	
	void getPerson() {
		System.out.println(id + " " + name + " " + age);
	}
}

public class Test1 {

	public static void main(String[] args) {
		//ClassName var_name = new ClassName();
		Person p = new Person();
		p.getPerson();

	}

}
