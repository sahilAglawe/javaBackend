package kapilit;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		 ArrayList<Employee> al = new ArrayList<>();
		   
		   
			Employee e1 = new Employee(123, "sahil", 27, 20000);
			Employee e2 = new Employee(111, "mahesh", 22, 30000);
			Employee e3 = new Employee(222, "shrikant", 25, 50000);
			Employee e4 = new Employee(333, "vaibhav", 24, 60000);
			
			al.add(e1);
			al.add(e2);
			al.add(e3);
			al.add(e4);
			
			Collections.sort(al, new ageCompare());
			
			for(Employee e : al)
				System.out.println(e);
		}
	}

