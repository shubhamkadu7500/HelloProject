package javathreads;

public class Test7 extends Thread{
	
	public void run() {
		for(int i = 1; i<=5; i++) {
			try {
				Thread.sleep(500);
			}catch (InterruptedException ex) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test7 obj1 = new Test7();
		obj1.start();
		try {
			obj1.join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		Test7 obj2 = new Test7();
		obj2.run();
		

	}

}
