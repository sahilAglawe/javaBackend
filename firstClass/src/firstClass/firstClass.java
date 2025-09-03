package firstClass;

public class firstClass {
	
	public int i ;
	public String name;
    super();
	

	public firstClass(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}



	@Override
	public String toString() {
		return "firstClass [i=" + i + ", name=" + name + "]";
	}
	
	protected void show() {
		System.out.println("firstclass show method");
	}

	
	public static void main(String[] ar) {
		firstClass obj = new firstClass();
		obj.show();
	}


}
