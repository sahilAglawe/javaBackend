package extend;

public interface subinterface extends superinterface {

	
	default void display() {
		System.out.println("overriden dispaly");
		System.out.println(superinterface.i);
		superinterface.super.display();
		
	}
}
