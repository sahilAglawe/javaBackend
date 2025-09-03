class privateConstructor{
	
	private privateConstructor(){
		System.out.println("constructor called");
		
	}
	
	private privateConstructor(){
		System.out.println("constructor invoked");
	}
	
	public static void main(String[] args){
		privateConstructor obj = new privateConstructor();
	}
}

class privateOne{
	privateConstructor obj = new privateConstructor();
}