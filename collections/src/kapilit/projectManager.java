package kapilit;

public class projectManager extends Emoloyee3 {


	public projectManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public projectManager(int id, String name, int salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "projectManager [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Emoloyee3 o) {
		
		if(this.id > o.id)
			return 34;
		else if(this.id < o.id)
			return -34;
		else
			return 0;
	}

}
