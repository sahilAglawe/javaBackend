package kapilit;

record Address(int doorNo, String state) {}
public class Employee {
	
	int id ;
	String name;
	int age, salary;
	Address address;
	

	public Employee() {
		super();
	}


	public Employee(int id, String name, int age, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address
				+ "]";
	}


	public static void main(String[] args) {
		
		Address add = new Address(111, "tl");
		Employee e1 = new Employee(222, "Sahil", 21, 200000, add);
		
		System.out.println(e1);

	}

}
