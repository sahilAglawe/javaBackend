package abstdemo;

public class subbclass extends abstractdm {

	public subbclass() {
		System.out.println("consu bhai");
	}
	
	public void test() {
		System.out.println("test method");
	}

	@Override
	void sahil() {
		System.out.println("overide abstract method");
	}

	public static void main(String[] args) {
		subbclass obj = new subbclass();
		obj.show();
		obj.test();
		obj.display();
		System.out.println(i);
		
		abstractdm obj1 = new subbclass();
		obj1.sahil();
		obj.show();
		obj.test();
		obj.display();
	}

}
