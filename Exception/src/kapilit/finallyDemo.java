package kapilit;

public class finallyDemo {

	void show(int i) {
		
		System.out.println("welcome to show");
		
		if(i == 0) {
			throw new ArithmeticException("throw error");
		}
			else {
				try 
				{
					int j = 350/i;
					System.out.println(j);
				}catch(ArithmeticException e) {System.out.println(e);}
			}
	}
	
	
	public static void main(String[] args) {
		
		finallyDemo obj = new finallyDemo();
	
		obj.show(0);
		System.out.println("end of main");
	}

}
