package kapilit;

public class FirstThread extends Thread {

	public void run() {
		System.out.println("welcome to run method");
	}
	public static void main(String[] args) {
		
	 System.out.println("welcome to main method");
	 FirstThread f1 = new  FirstThread();
	 FirstThread f2 = new  FirstThread();
	 f1.start();
	 f2.start();
	 System.out.println("end of main");
	 
			 
	}

}
