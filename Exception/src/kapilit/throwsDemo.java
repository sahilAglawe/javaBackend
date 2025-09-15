package kapilit;

import java.io.IOException;

public class throwsDemo {
	
	void show(int i) throws IOException {
		
		System.out.println("welcome to show");
		System.out.println(i);
		if(i == 0) {
			throw new IOException("error");
		} else {
		   int j = 100/i;
		   System.out.println(j);
		} 
		System.out.println("end of show");
	}

	public static void main(String[] args) throws Exception {
		
		throwsDemo obj = new throwsDemo();
		
		obj.show(0);
		
	}

}
