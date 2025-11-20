package kapilit;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<>();
		
		Employee e1 = new Employee(11,"sahil", 21,20000);
		Employee e2 = new Employee(22,"sahil", 21,20000);
		Employee e3 = new Employee(33,"sahil", 21,20000);
		Employee e4 = new Employee(44,"sahil", 21,20000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		
		Iterator<Employee> itr = hs.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
	}

}
