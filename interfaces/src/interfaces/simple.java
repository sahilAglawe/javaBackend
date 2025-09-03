package interfaces;

public class simple implements interfaces, interfacesecond {

	
	@Override
	public void test() {
		System.out.println("override test");
	
	}

	@Override
	public void show() {
		System.out.println("override show");
	
	}
	
	public void sim() {
		System.out.println("simple concrete method");
		interfaces.super.display();
	}
	

	public static void main(String[] args) {
		simple obj = new simple();
		obj.show();
		obj.test();
		System.out.println(interfaces.i);
		obj.sim();
	}

}
