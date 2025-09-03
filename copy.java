class Copycons {
	int empId;
	String empName;
	int age;
	
	
	
	Copycons(int empId, String empName, int age){
		
		this.empId = empId;// assign
		this.empName = empName;
		this.age = age;
	}
	
	Copycons(Copycons e){
		System.out.println("copycons constructor called");// copy constructor
		this.empId = e.empId;//initialize
		this.empName = e.empName;
		this.age = e.age;
	}
	
	public static void main(String[] args){
		Copycons obj = new Copycons(222, "savi", 22);
		Copycons obj1 = new Copycons(333, "visa", 23);
		
		
		System.out.println(obj.empId);
		System.out.println(obj.empName);
		System.out.println(obj.age);
		
		System.out.println(obj1.empId);
		System.out.println(obj1.empName);
		System.out.println(obj1.age);
	}
}