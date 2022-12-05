package javaabstraction;

interface I1{
	abstract void show();
	         void display();
}

public class Interface implements I1{
	public void show() {
	System.out.println("msg from show");
}

	public void display() {
		System.out.println("msg from display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj = new Interface();
		obj.display();
		obj.show();

	}

}
