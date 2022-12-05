package javathreads;

public class Test2 implements Runnable{
	@Override
	public void run() {
		System.out.println("thread started ---");
		
	}

	public static void main(String[] args) {
		Test2 r = new Test2();
		Thread t1 = new Thread(r);
		t1.start();
		try {
			t1.start();// we cannot start same thread twice
		}
		catch(Exception ex) {
			System.out.println("ok");
		}
	}
}
