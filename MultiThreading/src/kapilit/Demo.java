package kapilit;

public class Demo {

	public static void main(String[] args) {
		
		
		ThreadOne t1 = new ThreadOne("First");
		ThreadOne t2 = new ThreadOne("Second");
		
		ThreadTwo t3 = new ThreadTwo("Third");
		ThreadTwo t4 = new ThreadTwo("fourth");
		
		// t1.setName("First);
		//t2.setName("Second");
		// t3.setName("third);
		//t4.setName("fourth");
		
		t1.setPriority(10);
		t2.setPriority(8);
		t3.setPriority(5);
		t4.setPriority(3);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("Back to main");
	}

}
