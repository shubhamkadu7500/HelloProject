package javainheritance;

class Sports{
	String sport_name;
	public Sports(String sport_name) {
		super();
		
		this.sport_name = sport_name;
		System.out.println("Sport constructor");
	}
	
	void getSportDetails() {
		System.out.println(this.sport_name);
	}
}

class BasketBall extends Sports{

	public BasketBall(String sport_name) {
		super(sport_name);
		this.sport_name = sport_name;
		System.out.println("BasketBall constructor");
	}
	

}

class Hockey extends Sports{

	public Hockey(String sport_name) {
		super(sport_name);
		this.sport_name = sport_name;
		System.out.println("Hockey constructor");
	}
	
}

class BaseBall extends BasketBall{

	public BaseBall(String sport_name) {
		super(sport_name);
		this.sport_name = sport_name;
		System.out.println("BaseBall constructor");
	}
	
}
public class Test6 {

	public static void main(String[] args) {
		
		BaseBall b1 = new BaseBall("Hockey");
		b1.getSportDetails();
		

	}

}
