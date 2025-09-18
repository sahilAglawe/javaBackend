package kapilit;

public class Employee {

	
	int EmpId;
	String EmpName;
	int age, salary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, int age, int salary) {
		super();
		EmpId = empId;
		EmpName = empName;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
