package kapilit;

import java.util.ArrayList;

public class arrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Employee1> emp1 = new ArrayList<>();
		
		Employee1 obj = new Employee1(123, "sahil", 22, 200000);
		Employee1 obj1 = new Employee1(124, "mahesh", 23, 300000);
		Employee1 obj2 = new Employee1(125, "shrikant", 24, 400000);
		Employee1 obj3 = new Employee1(126, "vaibhav", 24, 500000);
		
		emp1.add(obj);
		emp1.add(obj1);
		emp1.add(obj2);
		emp1.add(obj3);
		
		System.out.println(emp1);

	}

}
