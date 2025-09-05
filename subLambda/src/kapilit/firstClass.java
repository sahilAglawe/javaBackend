package kapilit;

public class firstClass {

	public static void main(String[] args) {
		Second obj = (i , j)->{
			System.out.println("lambda");
			return i + j;
		};
		obj.display();
		System.out.println(obj.show(10, 20));
		

	}

}
