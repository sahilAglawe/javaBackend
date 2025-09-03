class methodOverloading{
	
	int addNums(int i, int j){
		return i+j;
	}
	int addNums(int i, int j, int k){
	   return i+j+k;
	}
	float addNums(int i, int j, float k){
	   return i+j+k;
	}
	
	public static void main(String[] args){
		methodOverloading obj = new methodOverloading();
		System.out.println(obj.addNums(20,30));
		System.out.println(obj.addNums(20,30,50));
		System.out.println(obj.addNums(20,30,50.11f));
	}
}