package kapilit;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
       TreeSet<Employee> ts = new TreeSet<>();
		
		Employee e1 = new Employee(11,"sahil", 21,20000);
		Employee e2 = new Employee(22,"sahil", 21,20000);
		Employee e3 = new Employee(33,"sahil", 21,20000);
		Employee e4 = new Employee(44,"sahil", 21,20000);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		Iterator<Employee> itr = ts.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
	}

}
