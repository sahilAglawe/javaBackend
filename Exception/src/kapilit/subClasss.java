package kapilit;

import java.io.IOException;

public class subClasss extends superClass {
	
	int i = 10;
	void display() {
		System.out.println("subClass display");
		System.out.println(i);
		
	}
	
	void show(int m) throws Exception {
		System.out.println("subclass show");
		throw new Exception("this is exception");
	}
	

	public static void main(String[] args) {
		
		subClasss obj = new subClasss();
		
			obj.display();
			try {
				obj.show(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
