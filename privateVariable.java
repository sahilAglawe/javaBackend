class privateVariable{
	private int i = 10;
	
	void show(){
		System.out.println(i);
	}
	public static void main(String[] args){
		privateVariable obj = new privateVariable();
		obj.show();
		System.out.println("same main");
		System.out.println(obj.i);
	}
}

class privateOne{
	
	public static void main(String[] args){
		privateVariable obj1 = new privateVariable();
		System.out.println("diffrent main");
		//System.out.println(obj1.i);
	}
}