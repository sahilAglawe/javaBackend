class Constructor {
	int empId;
	String empName;
	int age;
	
	Constructor(){
		System.out.println("constructor is called");
		empId = 111;
		empName = "krishna";
		age = 21;
	}
	
	Constructor(int empId, String empName,int age){
		this.empId = empId;
		this.empName = empName;
		this.age = age;
	}
	
	public static void main(String[] ar){
		Constructor obj = new Constructor();
		Constructor savi = new Constructor(1111, "savi" , 21);
		System.out.println(obj.empId);
		System.out.println(obj.empName);
		System.out.println(obj.age);
		
		System.out.println(savi.empId);
		System.out.println(savi.empName);
		System.out.println(savi.age);
		
		
	}
}