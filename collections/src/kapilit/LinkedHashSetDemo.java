package kapilit;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
LinkedHashSet<Employee> Lhs = new LinkedHashSet<>();
		
		Employee e1 = new Employee(11,"sahil", 21,20000);
		Employee e2 = new Employee(22,"sahil", 21,20000);
		Employee e3 = new Employee(33,"sahil", 21,20000);
		Employee e4 = new Employee(44,"sahil", 21,20000);
		
		Lhs.add(e1);
		Lhs.add(e2);
		Lhs.add(e3);
		Lhs.add(e4);
		
		Iterator<Employee> itr = Lhs.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());

	}

}
