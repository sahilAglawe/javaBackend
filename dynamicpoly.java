class dynamicpoly {
	
	void show(){
		System.out.println("super show");
	}
	
	void test(){
		System.out.println("super test");
	}
}

class dynamic extends dynamicpoly{
	
	void show(){
		System.out.println("overriden method");
	}
	
	public static void main(String[] args){
		dynamicpoly obj;
		obj = new dynamicpoly();
		
		obj.show();
		obj.test();
	}
}