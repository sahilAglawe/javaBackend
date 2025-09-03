package dypoly;

public class dynamic extends dynamicpoly {

	@Override
	void show() {
		
		System.out.println("overrriden method");
		
	}
	
	public static void main(String[] args) {
		
		dynamicpoly obj;
		obj = new dynamic();
		
		obj.show();
		obj.test();
                                                                                   
	}

}
