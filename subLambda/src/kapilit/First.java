package kapilit;

public interface First {

	int show(int i, int j);
	default void display() {
		System.out.println("First display");
	}
}
