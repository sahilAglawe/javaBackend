package interfaces;

public interface interfaces 
{
   
	public static final int i = 10;
	
	default void display() {
	    System.out.println("interface default display");
	}
	
	void show();
}
