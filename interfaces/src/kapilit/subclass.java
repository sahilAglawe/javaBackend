package kapilit;

public class subclass extends superclass implements firstinterface, secondinterface {

	int i = 20;
	@Override
	public void show() {
		System.out.println("overriden show");
	}

	@Override
	public void first() {
		System.out.println("overrriden first");
	}

	public void sahil() {
		System.out.println("overriden sahil");
	}
	
	public void display() {
		System.out.println("overrriden display");
		super.display();
		secondinterface.super.display();
	}
	
	public void test() {
		System.out.println("concrete method subclass");
		int x = super.i + firstinterface.i + secondinterface.i + i;
		System.out.println(x);
		
		
	}
	public static void main(String[] args) {
		subclass obj = new subclass();
		obj.show();
		obj.first();
		obj.sahil();
	    obj.display();
	    obj.test();
		
	}

}
