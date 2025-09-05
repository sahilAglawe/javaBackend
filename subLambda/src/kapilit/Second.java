package kapilit;

public interface Second  {

	int show(int i , int j);
	
	default void display(){
		System.out.println("Second display");
	}

	
}
