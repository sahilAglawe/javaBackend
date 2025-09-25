package kapilit;

public class Employee1 implements Comparable<Employee1> {

	
	int empId;
	String empName;
	int age, salary;
	Address address;
	
	public Employee1() {
		super();
	}


	


	public Employee1(int empId, String empName, int age, int salary, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}





	


	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary
				+ ", address=" + address + "]";
	}





	@Override
	public int compareTo(Employee1 o) {
		
		if(this.address.doorNo > o.address.doorNo)
			return 34;
		else if(this.address.doorNo < o.address.doorNo)
			return -34;
		else {
			return 0;
		}
	}
	
	
}
