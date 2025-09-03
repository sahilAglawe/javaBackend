package extend;

public interface superinterface {

	
	int i = 10;
	void show();
	default void display() {
		System.out.println("concrete superinterface display");
	}
}
