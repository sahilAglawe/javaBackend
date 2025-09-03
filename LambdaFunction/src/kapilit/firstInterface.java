package kapilit;

public interface firstInterface {

	
	void show();
	void demo();
	default void display() {
		System.out.println("Display");
	}
}
