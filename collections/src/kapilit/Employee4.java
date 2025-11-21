package kapilit;

record Address(int doorNo, String City, String state) {}
public class Employee4 {

	int id;
	String name;
	int age, salary;
	Address address;
	public Employee4() {
		super();
	}
	public Employee4(int id, String name, int age, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
	
}
