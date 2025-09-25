package kapilit;

abstract class Emoloyee3 implements Comparable<Emoloyee3> {

	int id;
	String name;
	int salary;
	public Emoloyee3() {
		super();
	}
	public Emoloyee3(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emoloyee3 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
