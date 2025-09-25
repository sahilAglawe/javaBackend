package kapilit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listDemo {

	public static void main(String[] args) {
		
	   ArrayList<Employee1> al = new ArrayList<>();
	   
	   Address add1 = new Address(777, "hyd" , "Tl");
	   Address add2 = new Address(888, "pune" , "Mh");
	   Address add3 = new Address(999, "culckata" , "Wb");
	   Address add4 = new Address(100, "delhi" , "up");
	   
		Employee1 e1 = new Employee1(123, "sahil", 21, 20000, add1);
		Employee1 e2 = new Employee1(111, "mahesh", 22, 30000, add2);
		Employee1 e3 = new Employee1(222, "shrikant", 23, 50000, add3);
		Employee1 e4 = new Employee1(333, "vaibhav", 24, 60000, add4);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Collections.sort(al);
		
		for(Employee1 e : al)
		  System.out.println(e);
	}

}
