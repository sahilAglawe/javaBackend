class Compare{
	
	int stuId;
	String stdName;
	int height;
	Compare(){
		System.out.println("Compare()");
	}
	
	Compare(int stuId, String stdName, int height){
		this.stuId  = stuId;
		this.stdName  = stdName;
		this.height = height;
		System.out.println("Compare(id,name,height)");
	}
	
	Compare CompareHeights(Compare s){
		if(this.height > s.height)
			return this;
		else
			return s;
	}
	
	
	
	
	public static void main(String[] args){
		Compare std0 = new Compare();
		Compare std1 = new Compare(111, "krishna", 180);
		Compare std2 = new Compare(222, "Murthy", 168);
		
		Compare var = std1.CompareHeights(std2);
		
		System.out.println(var.stuId);
		System.out.println(var.stdName);
		System.out.println(var.height);
		
	}
	
}