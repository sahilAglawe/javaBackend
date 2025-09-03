class employee{
	int empId;
	String empName;
	int age, salary;
	employee(){
		System.out.println("employee()");
	}
	employee(int empId, String empName, int age, int salary){
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		System.out.println("employee(empId, empName, age,salary)");
		
	}
}
class projectManager extends employee{
	int teamSize;
	String domain;
	
	projectManager(int empId, String empName, int age, int salary, int teamSize, String domain){
		
		super(empId, empName, age, salary);
		
		this.teamSize= teamSize;
		this.domain = domain;
		
		System.out.println("projectManager(teamSize, domain)");
		
	}
	
	
	public static void main(String[] args){
		projectManager pm1 = new projectManager(111, "sahil", 21, 100000, 10, "software Developer");
		
		System.out.println(pm1.empId);
		System.out.println(pm1.empName);
		System.out.println(pm1.age);
		System.out.println(pm1.salary);
		System.out.println(pm1.teamSize);
		System.out.println(pm1.domain);
	}
}
