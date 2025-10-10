package kapil.it;

public class firstClass {
	
	static void test(int m, int n) {
		System.out.println("firstclass test");
		
	}

	public static void main(String[] args) {
		
		firstInterface obj = firstClass :: test;
		obj.show(10, 20);
		obj.display();
	}

}
