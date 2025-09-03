package kapilit;

public class lambda {

	public static void main(String[] args) {
		
		functional obj = (i, j) -> {
			                       System.out.println("lambada");
			                       return i*j;
		                           };
		System.out.println(obj.show(10, 5));
		System.out.println(obj.display("java "));
	}

}
