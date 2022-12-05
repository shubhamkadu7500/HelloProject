package javaabstraction;

abstract class Task{
	
	void display() {
		System.out.println("msg from display");
	}
	
	abstract void show();//unimplemented method

}

public class Test1 extends Task{
	void show() {
		System.out.println("msg from show");
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.show();
		obj.display();
		

	}

}
