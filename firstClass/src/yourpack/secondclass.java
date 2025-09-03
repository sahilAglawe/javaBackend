package yourpack;

import mypack.firstclass;

public class secondclass extends firstclass {

	
	public static void main(String[] args) {
		firstclass obj;
		obj = new firstclass();
		firstclass obj1 = new firstclass(1,2);
		secondclass obj2 = new secondclass();
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		
		
	}
}
