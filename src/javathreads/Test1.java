package javathreads;

public class Test1 extends Thread {
	
	public void run() {
		System.out.println("thread started ---");
	}
	public static void main(String[] args) {
		Test1 thread1 = new Test1();
		thread1.start();
		

	}

}
