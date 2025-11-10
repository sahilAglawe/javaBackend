package kapilit;

public class SecondThread implements Runnable {

	@Override
	public void run() {
		System.out.println("welcome to run method");

	}

	public static void main(String[] args) {


		SecondThread obj= new SecondThread();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		System.out.println("welcome to main");
		t1.start();
		t2.start();
		System.out.println("end of main");
	}

}
