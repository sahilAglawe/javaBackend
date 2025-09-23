package kapilit;

public class Employee1 {

	
	int empId;
	String empName;
	int age, salary;
	
	
	public Employee1() {
		super();
	}


	public Employee1(int empId, String empName, int age, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
