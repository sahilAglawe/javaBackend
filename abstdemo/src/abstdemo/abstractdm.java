package abstdemo;

public abstract class abstractdm {

	static int i = 10;
	
	static void show() {
		abstractdm obj;
		System.out.println("super void show");
	}
	
	public abstractdm(){
		
		System.out.println("consu bhai super");
	}
	
	void display() {
		System.out.println("display method");
	}
	
	abstract void sahil();
}
