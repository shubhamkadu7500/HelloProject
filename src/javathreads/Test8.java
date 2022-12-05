package javathreads;

public class Test8 extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Deamon Thread");
		}else {
			System.out.println("User Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 t1 = new Test8();
		Test8 t2 = new Test8();
		Test8 t3 = new Test8();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();

	}

}
