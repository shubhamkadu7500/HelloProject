package javainheritance;


class Vehicle{
	int speed;
	
	Vehicle(){
		System.out.println("Vehicle Default condtructor invoked");
	}
	
	Vehicle(int speed){
		this.speed= speed;
		
	}
	
	void getVehicleDetails() {
		System.out.println("Vehicle running at speed : " + this.speed + "km/hr.");
	}
}

class Bike extends Vehicle{
	int bike_speed;
	
	Bike(){
		super();
		System.out.println("Default Bike constructor invoked !!");
	}
	
	Bike(int bike_speed){
		super(bike_speed);
		this.bike_speed = bike_speed;
	}
	
	void getBikeDetails() {
		super.getVehicleDetails();
		System.out.println("bike is running at speed : " + this.bike_speed + "km/hr.");
		
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bike();
		Bike bobj = new Bike(100);
		bobj.getBikeDetails();

	}

}
