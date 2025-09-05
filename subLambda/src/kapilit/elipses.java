package kapilit;

public class elipses {
	
	int add(int...i) {
		int sum = 0;
		for(int j : i) {
			sum = sum + j;
		}
		return sum;
		
	}
		

	public static void main(String[] args) {
		
		elipses obj = new elipses();
	//	System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 10, 20, 20, 20, 20));

		
	}

}
