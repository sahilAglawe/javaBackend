package kapil.it;

public interface firstInterface {

	
	void show(int i, int j);
	
	default void display() {
		System.out.println("firstInterface display method");
	}
}
