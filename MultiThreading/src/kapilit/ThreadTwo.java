package kapilit;

public class ThreadTwo extends Thread {
String str;
public ThreadTwo(String str) {
	super(str);
}

public void run() {
	System.out.println("welcome to ThreadTwo run method");
	for(int i = 5; i>= 0; i--) {
		System.out.println(Thread.currentThread().getName()+"   " + i);
		
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

}
