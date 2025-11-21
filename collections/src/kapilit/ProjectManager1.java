package kapilit;

public class ProjectManager1 extends Employee4 {

	
	int teamSize;
	String ProjectName;
	public ProjectManager1() {
		super();
	}
	public ProjectManager1(int id, String name, int age, int salary, Address address, int teamSize,
			String projectName) {
		super(id, name, age, salary, address);
		this.teamSize = teamSize;
		ProjectName = projectName;
	}
	@Override
	public String toString() {
		return "ProjectManager1 [teamSize=" + teamSize + ", ProjectName=" + ProjectName + ", id=" + id + ", name="
				+ name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
