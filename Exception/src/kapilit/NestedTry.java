package kapilit;

public class NestedTry {
	
	void show(int i) {
		
	try
	{
		System.out.println("welcome to show");
		int j = 300/i;
		System.out.println(j);
		
		try
		{
		System.out.println(333/0);
		}catch(Exception e) {System.out.println(e);}
		try
		{
		int k = 346/0;
		}catch(Exception e) {System.out.println(e);}
	}catch(Exception e) {System.out.println(e);}
	System.out.println("end of show");
	}

	public static void main(String[] args) {
		
		NestedTry obj = new NestedTry();
		obj.show(0);

	}

}
