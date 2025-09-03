package kapilit;

public class firstClass {

	public static void main(String[] args) {
		
		firstInterface obj = new firstInterface() {

			@Override
			public void show() {
				System.out.println("show method");
				
			}

			@Override
			public void demo() {
				
				System.out.println("demo method");
			}
			
		};
		
		obj.show();
		obj.demo();
		obj.display();

	}

}
