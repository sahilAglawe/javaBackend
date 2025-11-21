package kapilit;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		Address add1 = new Address(11,"hyd", "TL");
		Address add2 = new Address(11,"pune", "MH");
		Address add3 = new Address(11,"BLR", "KA");
		
	
		
		ProjectManager1 pm1 = new ProjectManager1(1021,"surya", 21, 50000, add1, 45 , "Bank");
		
		Employee4 e1 = new Employee4(1022, "sahil", 23, 30000, add2);
		Employee4 e2 = new Employee4(1023, "shri", 24, 40000, add3);
		
		
		HashMap<Employee4, Integer> hm = new HashMap<>();
		
		hm.put(pm1, 12);
		hm.put(e1, 13);
		hm.put(e2, 14);
		
		for(Map.Entry<Employee4, Integer> o : hm.entrySet())
			System.out.println(o.getKey() + " " + o.getValue());

	}

}
