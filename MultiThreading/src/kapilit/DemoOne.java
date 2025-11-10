package kapilit;

public class DemoOne {

	public static void main(String[] args) {
		
		ThreadOne t1 =  new ThreadOne();
		ThreadOne t2 = new ThreadOne();
		ThreadOne t3 = new ThreadOne();
		ThreadOne t4 = new ThreadOne();
		
		Thread.currentThread().interrupted();
		t1.start();
		try {
			t1.join(1500);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(Thread.currentThread().isInterrupted());
	}

}
