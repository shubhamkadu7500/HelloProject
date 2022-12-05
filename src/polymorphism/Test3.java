package polymorphism;
// function overriding
class Vehicle{
	void display() {
		System.out.println("vehical is running !!");
	}
}

class Bike extends Vehicle {
	void display() {
		System.out.println("Bike is running !!");
	}
}

public class Test3 {

	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.display();
		
		Vehicle obj1 = new Vehicle();
		obj1.display();

	}

}
