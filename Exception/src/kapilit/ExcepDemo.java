package kapilit;

public class ExcepDemo {

	public static void main(String[] args) {
		
		System.out.println("welcome to main");
		try
		{
		int j = 340/0; 
		System.out.println(j);
		}catch(Exception e) {System.out.println(e);}
		System.out.println("end of main");
		

	}

}
