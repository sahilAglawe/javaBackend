package kapil.it;

public class secondClass {

	int test(int m, int k) {
		System.out.println("secondclass test");
		m = m + k;
		return m;
	}
	public static void main(String[] args) {
		
		secondClass obj = new secondClass();
		secondInterface obj1 = obj :: test;
		
		System.out.println(obj1.show(10,20));
	}

}
