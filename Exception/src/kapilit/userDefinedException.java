package kapilit;

public class userDefinedException extends Exception {
	
	public userDefinedException(String str) {
		
	}

	public userDefinedException() {
		
	}

	void show(int i) throws userDefinedException {
		System.out.println("void method");
		if(i == 0 ) {
			throw new userDefinedException("this is user defined exception");
		}
	}

	public static void main(String[] args) {
		
		userDefinedException use = new userDefinedException();
		try {
			use.show(0);
		} catch (userDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
