class Superclass{
	
	int i = 20;
	void show(){
		System.out.println(i);
	}
}

class Subclass extends Superclass{
	int i = 50;
	void display(){
		System.out.println(super.i);
	}
	
	

public static void main(String[] args){
		
		Subclass obj = new Subclass();
		obj.show();
		obj.display();
		
	}
}
