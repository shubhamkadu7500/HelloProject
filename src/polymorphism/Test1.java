package polymorphism;
// poly morphism function overloading

class Calculation{
	void addition(int x,int y) {
		int res;
		res = x+y;
		System.out.println("sum of two no :" + res);
	}
	
	void addition(int x,int y,int z) {
		int res;
		res = x+y+z;
		System.out.println("sum of three no: " + res);
	}
}
public class Test1 {

	public static void main(String[] args) {
		Calculation obj = new Calculation();
		obj.addition(20,30);
		obj.addition(11, 22, 33);
		

	}

}
