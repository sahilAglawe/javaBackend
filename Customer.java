class Customer{
	int id , price, item;
	String name;
	
	Customer(){
		System.out.println("Customer()");
	}
	
	Customer(int id){
		this.id = id;
		System.out.println("Customer(id)");
	}
		Customer(int id, int price){
			this(id);
			this.price = price;
			System.out.println("Customer(id, price)");
		}
		
		Customer(int id, int price, int item){
			this(id, price);
			this.item = item;
			System.out.println("Customer(id, price, item)");
		}
		
		Customer(int id, int price, int item, String name){
			this(id, price, item);
			this.name = name;
			System.out.println("Customer(id, price, item, name)");
		}
		
		public static void main(String[] args){
			Customer obj = new Customer();
			Customer obj1 = new Customer(11, 20000, 1, "savi");
			
			System.out.println(obj1.id);
			System.out.println(obj1.price);
			System.out.println(obj1.item);
			System.out.println(obj1.name);
		}
}