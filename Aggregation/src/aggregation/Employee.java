package aggregation;

public class Employee {
	
	int empId;
	String empName;
	int age, salary;
    Address address;
    
    

	public Employee() {
		super();
	}

	
	


	public Employee(int empId, String empName, int age, int salary, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	
	




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary
				+ ", address=" + address + "]";
	}





	public static void main(String[] args) {
		

		Address add1 = new Address(123, "ameerpet", "hyd", "TL", "India");
		Address add2 = new Address(222, "SadashivPeth", "Pune", "Mh", "India");
		Address add3 = new Address(333, "MukharjeeNagar", "Delhi", "DL", "India");
		
		Employee e1 = new Employee(44, "Sahil", 22, 200000, add1);
		Employee e2 = new Employee(55, "Shrikant", 23, 300000, add2);
		Employee e3 = new Employee(66, "Mahesh", 24, 400000, add3);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
