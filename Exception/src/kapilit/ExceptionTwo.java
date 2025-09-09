package kapilit;

public class ExceptionTwo {

	public static void main(String[] args) {
		
		try
		{
		int i[] = new int[5];
		
		i[5] = 320/0;
		for(int j :i)
			System.out.println(j);
		}catch(Exception e) {System.out.println(e);}
	  System.out.println("end of main");

	}

}
