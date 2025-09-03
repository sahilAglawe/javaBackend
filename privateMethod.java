class privateMethod{
	
	private void show(){
		System.out.println("This is show method");
	}
	
	void display(){
		System.out.println("This is Display Method");
		show();
	}
	
	public static void main(String[] args){
		privateMethod obj = new privateMethod();
		obj.show();
	}
}

class privateOne{
	
	public static void main(String[] args){
		privateMethod obj1 = new privateMethod();
		obj1.display();
	}
}