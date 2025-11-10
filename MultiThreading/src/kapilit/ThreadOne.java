package kapilit;

public class ThreadOne extends Thread {

	String str;
	public ThreadOne(String str) {
		super(str);
	}
	
	public ThreadOne() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println("welcome to run method");
		for(int i = 0; i<= 5; i++) {
			System.out.println(Thread.currentThread().getName()+ "   " + i);
			System.out.println(Thread.interrupted()+ "  " + i);
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
